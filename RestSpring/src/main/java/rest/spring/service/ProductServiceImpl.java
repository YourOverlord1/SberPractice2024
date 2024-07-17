package rest.spring.service;

import rest.spring.model.Product;
import rest.spring.repository.LocalProductRepository;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    private LocalProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(LocalProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void addProduct(Product product) {
        productRepository.addProduct(product);
    }

    @Override
    public boolean delit(String name) {
        this.productRepository.delit(name);
        return true;
    }

    @Override
    public Product getProduct(String name) {
        return this.productRepository.getProduct(name);
    }

    @Override
    public HashMap<String, Product> getAllProducts() {
        return productRepository.getAll();
    }
}