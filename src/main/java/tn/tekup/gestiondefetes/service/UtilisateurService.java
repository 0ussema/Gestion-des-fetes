package tn.tekup.gestiondefetes.service;

import java.util.List;

import tn.tekup.gestiondefetes.model.Role;
import tn.tekup.gestiondefetes.model.Utilisateur;

public interface UtilisateurService {

	Utilisateur saveUtilisateur(Utilisateur utilisateur);
	Role saveRole(Role role);
	void addRoleToUser(String username, String roleName);
	Utilisateur getUtilisateur(String username);
	List<Utilisateur> getUtilisateurs();
	
	
}
