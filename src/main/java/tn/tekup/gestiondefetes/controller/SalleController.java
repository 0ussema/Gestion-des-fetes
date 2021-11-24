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
import tn.tekup.gestiondefetes.model.Salle;
import tn.tekup.gestiondefetes.service.SalleService;

@RestController
@AllArgsConstructor
@NoArgsConstructor
@RequestMapping("/api/salle")
public class SalleController {

	@Autowired
	private SalleService salleService;
	
	@GetMapping()
	public List<Salle> getAllSalles(){
		return salleService.getAllSalles();
	}
	
	@PostMapping
	public Salle saveOrUpdate(@RequestBody Salle salle) {
		return salleService.saveOrUpdate(salle);
	}
	
	@DeleteMapping("/{id}")
	public void deleteSalle(@PathVariable Long id) {
		salleService.deleteSalle(id);
	}
	
}
