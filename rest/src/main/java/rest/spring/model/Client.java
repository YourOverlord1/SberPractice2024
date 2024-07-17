package rest.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import rest.spring.model.Basket;

@Data
@AllArgsConstructor
public class Client {
    private long id;
    private String name, login, password, email;
    private Basket basket;
}
