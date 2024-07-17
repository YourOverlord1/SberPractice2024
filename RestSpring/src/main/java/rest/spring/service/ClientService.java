package rest.spring.service;

import rest.spring.model.Client;
import java.util.HashMap;

public interface ClientService {
    void addClient(Client client);

    HashMap<String, Client> getAll();

    Client getClient(String name);
}