package tn.tekup.gestiondefetes.service;

import java.util.List;

import tn.tekup.gestiondefetes.model.Proprietaire;

public interface ProprietaireService {

	List<Proprietaire> getAllProprietaire();
	Proprietaire creatOrSave(Proprietaire Proprietaire);
	void deleteProprietaire(Long id);
}
