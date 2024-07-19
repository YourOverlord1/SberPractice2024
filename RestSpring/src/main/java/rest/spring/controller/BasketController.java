package rest.spring.controller;

import lombok.Data;
import rest.spring.model.Basket;
import rest.spring.model.Client;
import rest.spring.service.BasketService;
import rest.spring.service.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Data
@RestController
public class BasketController {
    private BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @PostMapping(path = "/basket")
    public ResponseEntity<Void> create() {
        basketService.addBasket();
        return ResponseEntity.ok().build();
    }

    @PostMapping(path = "/basketDelit")
    public ResponseEntity<Void> getClient(@PathVariable Client client) {
        basketService.delitBasket(client);
        return ResponseEntity.ok().build();
    }
}