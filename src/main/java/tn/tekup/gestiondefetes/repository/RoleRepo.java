package tn.tekup.gestiondefetes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.tekup.gestiondefetes.model.Role;

public interface RoleRepo extends JpaRepository<Role, Long>{

	Role findByName(String name);
}
