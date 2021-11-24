package tn.tekup.gestiondefetes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.tekup.gestiondefetes.model.Salle;
import tn.tekup.gestiondefetes.repository.SalleRepo;

@Service
public class SalleServiceImpl implements SalleService {

	@Autowired
	private SalleRepo salleRepo;
	
	@Override
	public List<Salle> getAllSalles() {
		return salleRepo.findAll();
	}

	@Override
	public Salle saveOrUpdate(Salle salle) {
		return salleRepo.save(salle);
	}

	@Override
	public void deleteSalle(Long id) {
		salleRepo.deleteById(id);

	}

}
