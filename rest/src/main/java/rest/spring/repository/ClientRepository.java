package rest.spring.repository;

import rest.spring.model.Client;
import java.util.HashMap;

public interface ClientRepository {
    void addClient(Client client);

    void delit(String name);

    Client getClient(String name);

    HashMap<String, Client> getAll();
}