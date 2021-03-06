package tn.tekup.gestiondefetes.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import tn.tekup.gestiondefetes.model.Role;
import tn.tekup.gestiondefetes.model.Utilisateur;
import tn.tekup.gestiondefetes.service.UtilisateurService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UtilisateurController {


	private final UtilisateurService utilisateurService;
	
	@GetMapping("/users")
	public ResponseEntity<List<Utilisateur>> getUsers(){
		return ResponseEntity.ok().body(utilisateurService.getUtilisateurs());
	}
	
	@PostMapping("/users/save")
	public ResponseEntity<Utilisateur> saveUtilisateur(@RequestBody Utilisateur utilisateur){
		URI uri =URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/users/save").toUriString());
		return ResponseEntity.created(uri).body(utilisateurService.saveUtilisateur(utilisateur));
	}
	
	@PostMapping("/role/save")
	public ResponseEntity<Role> saveRole(@RequestBody Role role){
		URI uri =URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/role/save").toUriString());
		return ResponseEntity.created(uri).body(utilisateurService.saveRole(role));
	}
	
	@PostMapping("/role/addtouser")
	public ResponseEntity<?> addRoleToUser(@RequestBody RoleToUserForm form){
		utilisateurService.addRoleToUser(form.getUsername(), form.getRoleName());
		return ResponseEntity.ok().build();
	}
	

}
@Data
class RoleToUserForm{
	private String username;
	private String roleName;
}