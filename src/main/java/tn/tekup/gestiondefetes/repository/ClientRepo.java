package tn.tekup.gestiondefetes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.tekup.gestiondefetes.model.Client;

public interface ClientRepo extends JpaRepository<Client, Long> {

}
