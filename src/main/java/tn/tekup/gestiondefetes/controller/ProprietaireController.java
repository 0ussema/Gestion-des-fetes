package tn.tekup.gestiondefetes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import tn.tekup.gestiondefetes.model.Proprietaire;
import tn.tekup.gestiondefetes.service.ProprietaireService;

@RestController
@NoArgsConstructor
@AllArgsConstructor
@RequestMapping("/api/proprietaire")
public class ProprietaireController {
	
	@Autowired
	private ProprietaireService proprietaireService;
	
	@GetMapping
	public List<Proprietaire> getAllProprietaire(){
		return proprietaireService.getAllProprietaire();
	}

	@PostMapping
	public Proprietaire saveOrUpdate(@RequestBody Proprietaire proprietaire) {
		return proprietaireService.creatOrSave(proprietaire);
	}
	
	@DeleteMapping("/{id}")
	public void deleteProprietaire(@PathVariable Long id) {
		proprietaireService.deleteProprietaire(id);
	}
}
