package rest.spring.controller;

import lombok.Data;
import rest.spring.model.Client;
import rest.spring.repository.ClientRepository;
import rest.spring.service.ClientService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Data
@RestController
public class ClientController {
    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping(path = "/user")
    public ResponseEntity<Void> create(@RequestBody Client client) throws URISyntaxException {
        clientService.addClient(client);
        return ResponseEntity.created(new URI("http://localhost:8080/user/" + client.getId())).build();
    }

    @GetMapping(path = "user/{name}")
    public ResponseEntity<Client> getClient(@PathVariable String name) {
        Optional<Client> searched = Optional.ofNullable(clientService.getClient(name));
        return searched.isPresent()
                ? ResponseEntity.ok().body(searched.get())
                : ResponseEntity.notFound().build();
    }
}