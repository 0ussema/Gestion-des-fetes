package tn.tekup.gestiondefetes.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import tn.tekup.gestiondefetes.model.Role;
import tn.tekup.gestiondefetes.model.Utilisateur;
import tn.tekup.gestiondefetes.repository.RoleRepo;
import tn.tekup.gestiondefetes.repository.UtilisateurRepo;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class UtilisateurServiceImpl implements UtilisateurService , UserDetailsService {

	
	private final UtilisateurRepo utilisateurRepo;
	
	private final RoleRepo roleRepo;
	
	private final PasswordEncoder passwordEncoder;
	
	@Override
	public Utilisateur saveUtilisateur(Utilisateur utilisateur) {
		log.info("saving new user {} to the database" , utilisateur.getName());
		utilisateur.setPassword(passwordEncoder.encode(utilisateur.getPassword()));
		return utilisateurRepo.save(utilisateur);
	}

	@Override
	public Role saveRole(Role role) {
		log.info("saving new role {} to the database", role.getName());
		return roleRepo.save(role);
	}

	@Override
	public void addRoleToUser(String username, String roleName) {
		log.info("adding role {} to  user {} ",  roleName, username);
		Utilisateur utilisateur = utilisateurRepo.findByUsername(username);
		Role role = roleRepo.findByName(roleName);
		utilisateur.getRoles().add(role);
	}

	@Override
	public Utilisateur getUtilisateur(String username) {
		log.info("fetching user {}", username);
		return utilisateurRepo.findByUsername(username);
	}

	@Override
	public List<Utilisateur> getUtilisateurs() {
		log.info("fetching all users");
		return utilisateurRepo.findAll();
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Utilisateur utilisateur =utilisateurRepo.findByUsername(username);
		if(utilisateur == null) {
			log.error("user not found in database");
			throw new UsernameNotFoundException("user not found in database execptionnn");
		}else {
			log.info("user found in the database {}",username);
		}
		
		Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
		utilisateur.getRoles().forEach(r-> { 
				authorities.add( new SimpleGrantedAuthority(r.getName()));
			});
		
		return new org.springframework.security.core.userdetails.User(utilisateur.getUsername(), utilisateur.getPassword(), authorities);
	}

}
