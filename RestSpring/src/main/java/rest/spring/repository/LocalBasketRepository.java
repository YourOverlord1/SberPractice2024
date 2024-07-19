package rest.spring.repository;

import lombok.Data;
import rest.spring.base.BaseData;
import rest.spring.model.Basket;
import rest.spring.model.Client;
import rest.spring.model.Product;
import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

@Data
@Repository
public class LocalBasketRepository implements BasketRepository {
    private BaseData<Client, Basket> base = new BaseData<>();

    @Override
    public long addBasket() {
        int number = base.getHolder();
        base.setHolder(base.getHolder() + 1);
        return base.getHolder();
    }

    @Override
    public void delitBasket(Client client) {
        this.base.remove(client);
    }
}