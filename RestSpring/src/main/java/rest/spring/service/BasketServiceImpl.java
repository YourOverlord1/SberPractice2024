package rest.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import rest.spring.model.Basket;
import rest.spring.model.Client;
import rest.spring.repository.LocalBasketRepository;
import rest.spring.repository.LocalClientRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class BasketServiceImpl implements BasketService {
    private LocalBasketRepository basketRepository;

    @Autowired
    public BasketServiceImpl(LocalBasketRepository basketRepository) {
        this.basketRepository = basketRepository;
    }

    @Override
    public void addBasket() {
        basketRepository.addBasket();
    }

    @Override
    public void delitBasket(Client client) {
        basketRepository.delitBasket(client);
    }
}