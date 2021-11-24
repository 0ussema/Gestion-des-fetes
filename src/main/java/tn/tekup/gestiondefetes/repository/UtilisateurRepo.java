package tn.tekup.gestiondefetes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.tekup.gestiondefetes.model.Utilisateur;

public interface UtilisateurRepo extends JpaRepository<Utilisateur, Long>{

	Utilisateur findByUsername(String username);
}
