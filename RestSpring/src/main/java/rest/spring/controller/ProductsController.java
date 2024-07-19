package rest.spring.controller;

import lombok.Data;
import rest.spring.model.Client;
import rest.spring.model.Product;
import rest.spring.service.ClientService;
import rest.spring.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.PrinterGraphics;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Data
@RestController
@RequestMapping(path = "/")
public class ProductsController {
    private ProductService productService;

    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping(path = "/product")
    public ResponseEntity<String> create(@RequestBody Product product) throws URISyntaxException {
        productService.addProduct(product);
        return ResponseEntity.created(new URI("http://localhost:8080/product/" + product.getId())).build();
    }

    @PostMapping(path = "/product/delit")
    public ResponseEntity<Void> delit(@RequestBody String name) {
        return productService.delit(name)
                ? ResponseEntity.noContent().build()
                : ResponseEntity.notFound().build();
    }

    @GetMapping(path = "product/{name}")
    public ResponseEntity<Product> getProduct(@PathVariable String name) {
        Optional<Product> searched = Optional.ofNullable(productService.getProduct(name));
        return searched.isPresent()
                ? ResponseEntity.ok().body(searched.get())
                : ResponseEntity.notFound().build();

    }

    @GetMapping(path = "productAll")
    public ResponseEntity<HashMap<String, Product>> getAllProducts() {
        HashMap<String, Product> searched = productService.getAllProducts();
        return !searched.isEmpty()
                ? ResponseEntity.ok().body(searched)
                : ResponseEntity.notFound().build();
    }
}