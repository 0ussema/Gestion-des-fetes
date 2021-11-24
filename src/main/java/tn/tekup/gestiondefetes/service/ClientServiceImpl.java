package tn.tekup.gestiondefetes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.tekup.gestiondefetes.model.Client;
import tn.tekup.gestiondefetes.repository.ClientRepo;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientRepo clientRepo;
	
	@Override
	public List<Client> getAllClient() {
		return clientRepo.findAll();
	}

	@Override
	public Client createOrUpdate(Client client) {
		return clientRepo.save(client);
	}

	@Override
	public void deleteClient(Long id) {
		clientRepo.deleteById(id);
	}

}
