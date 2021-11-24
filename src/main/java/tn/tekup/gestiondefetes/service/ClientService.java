package tn.tekup.gestiondefetes.service;

import java.util.List;

import tn.tekup.gestiondefetes.model.Client;

public interface ClientService {

	List<Client> getAllClient();
	Client createOrUpdate(Client client);
	void deleteClient(Long id);
}
