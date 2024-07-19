package rest.spring.repository;

import lombok.Data;
import rest.spring.base.BaseData;
import rest.spring.model.Basket;
import rest.spring.model.Client;
import rest.spring.model.Product;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Data
@Repository
public class LocalClientRepository implements ClientRepository {
    private BaseData<String, Client> base = new BaseData<>();

    @Override
    public void addClient(Client client) {
        int number = base.getHolder();
        base.setHolder(base.getHolder() + 1);
        client.setId(number);
        this.base.setStorage(client.getName(), client);
    }

    @Override
    public void delit(String name) {
        this.base.remove(name);
    }

    @Override
    public Client getClient(String name) {
        return this.base.get(name);
    }

    @Override
    public HashMap<String, Client> getAll() {
        return this.base.getAll();
    }
}