package rest.spring.repository;

import rest.spring.model.Product;
import java.util.HashMap;

public interface ProductRepository {
    void addProduct(Product product);

    void delit(String name);

    Product getProduct(String name);

    public HashMap<String, Product> getAll();
}