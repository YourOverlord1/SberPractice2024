package rest.spring.repository;

import rest.spring.model.Client;

public interface BasketRepository {
    long addBasket();

    void delitBasket(Client client);
}