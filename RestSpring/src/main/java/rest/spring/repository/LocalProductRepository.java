package rest.spring.repository;

import lombok.Data;
import rest.spring.base.BaseData;
import rest.spring.model.Basket;
import rest.spring.model.Client;
import rest.spring.model.Product;
import org.springframework.stereotype.Repository;
import java.util.HashMap;

@Data
@Repository
public class LocalProductRepository implements ProductRepository {
    private BaseData<String, Product> base = new BaseData<>();

    @Override
    public void addProduct(Product product) {
        int number = base.getHolder();
        base.setHolder(base.getHolder() + 1);
        product.setId(number);
        this.base.setStorage(product.getName(), product);
    }

    @Override
    public void delit(String name) {
        this.base.remove(name);
    }

    @Override
    public Product getProduct(String name) {
        return this.base.get(name);
    }

    @Override
    public HashMap<String, Product> getAll() {
        return this.base.getAll();
    }
}