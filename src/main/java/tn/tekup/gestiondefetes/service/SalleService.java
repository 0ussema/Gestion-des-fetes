package tn.tekup.gestiondefetes.service;

import java.util.List;

import tn.tekup.gestiondefetes.model.Salle;

public interface SalleService {

	List<Salle> getAllSalles();
	Salle saveOrUpdate(Salle salle);
	void deleteSalle(Long id);
}
