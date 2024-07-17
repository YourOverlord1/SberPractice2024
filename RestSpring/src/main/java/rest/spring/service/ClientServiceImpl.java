package rest.spring.service;

import rest.spring.model.Client;
import rest.spring.repository.LocalClientRepository;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {
    private LocalClientRepository clientRepository;

    @Autowired
    public ClientServiceImpl(LocalClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public void addClient(Client client) {
        clientRepository.addClient(client);
    }

    @Override
    public HashMap<String, Client> getAll() {
        return this.clientRepository.getAll();
    }

    @Override
    public Client getClient(String name) {
        return clientRepository.getClient(name);
    }
}