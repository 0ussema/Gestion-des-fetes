package tn.tekup.gestiondefetes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.tekup.gestiondefetes.model.Admin;

public interface AdminRepo extends JpaRepository<Admin, Long> {

}
