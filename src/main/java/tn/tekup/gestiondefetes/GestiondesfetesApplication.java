package tn.tekup.gestiondefetes;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import tn.tekup.gestiondefetes.model.Role;
import tn.tekup.gestiondefetes.model.Utilisateur;
import tn.tekup.gestiondefetes.service.UtilisateurService;

@SpringBootApplication
public class GestiondesfetesApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestiondesfetesApplication.class, args);
	}
	
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	CommandLineRunner run(UtilisateurService utilisateurService) {
		return args ->{
			utilisateurService.saveRole(new Role(null, "ROLE_USER"));
			utilisateurService.saveRole(new Role(null, "ROLE_MANAGER"));
			utilisateurService.saveRole(new Role(null, "ROLE_ADMIN"));
			
			utilisateurService.saveUtilisateur(new Utilisateur(null, "oussema jaziri" , "oussema", "1234", new ArrayList<>()));
			utilisateurService.saveUtilisateur(new Utilisateur(null, "slimene daas" , "slimene", "1234", new ArrayList<>()));
			utilisateurService.saveUtilisateur(new Utilisateur(null, "saif belhaj" , "saif", "1234", new ArrayList<>()));
			
			utilisateurService.addRoleToUser("oussema", "ROLE_ADMIN");
			utilisateurService.addRoleToUser("saif", "ROLE_MANAGER");
			
		};
	}

}
