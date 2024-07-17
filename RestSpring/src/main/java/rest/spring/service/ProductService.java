package rest.spring.service;

import rest.spring.model.Product;
import java.util.HashMap;

public interface ProductService {
    void addProduct(Product product);

    boolean delit(String name);

    Product getProduct(String name);

    HashMap<String, Product> getAllProducts();
}