package tn.tekup.gestiondefetes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.tekup.gestiondefetes.model.Proprietaire;
import tn.tekup.gestiondefetes.repository.ProprietaireRepo;

@Service
public class ProprietaireServiceImpl implements ProprietaireService{

	@Autowired
	private ProprietaireRepo proprietaireRepo;
	
	@Override
	public List<Proprietaire> getAllProprietaire() {
		return proprietaireRepo.findAll();
	}

	@Override
	public Proprietaire creatOrSave(Proprietaire proprietaire) {
		return proprietaireRepo.save(proprietaire);
	}

	@Override
	public void deleteProprietaire(Long id) {
		proprietaireRepo.deleteById(id);
		
	}

}
