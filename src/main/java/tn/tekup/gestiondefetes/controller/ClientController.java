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
import tn.tekup.gestiondefetes.model.Client;
import tn.tekup.gestiondefetes.service.ClientService;

@RestController
@AllArgsConstructor
@NoArgsConstructor
@RequestMapping("/api/client")
public class ClientController {

	@Autowired
	private ClientService clientService;

	@GetMapping
	public List<Client> getAllClient(){
		return clientService.getAllClient();
	}
	
	@PostMapping
	public Client saveOrUpdate(@RequestBody Client client) {
		return clientService.createOrUpdate(client);
	}
	
	@DeleteMapping("/{id}")
	public void deleteClient(@PathVariable Long id) {
		clientService.deleteClient(id);
	}
}

