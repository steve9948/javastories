package com.steve.simplewebapp.controller;
import com.steve.simplewebapp.model.Product;
import com.steve.simplewebapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping()
    public ResponseEntity <List<Product>> getProducts() {
        return ResponseEntity.ok(service.getProducts());
    }

    @GetMapping("/{productId}")//get dynamically according to product id
    public ResponseEntity <Product> getProductById(@PathVariable int productId) {
        Product product = service.getProductById(productId);
        if (product == null) {
            return ResponseEntity.notFound().build();
        }else {
            return ResponseEntity.ok(product);
        }
    }

    @PostMapping
    public ResponseEntity <Product> addProduct(@RequestBody Product product) {
        Product saved = service.addProduct(product);
        return ResponseEntity.status(201).body(saved);
    }

    @PutMapping("/{productId}")
    public ResponseEntity<Product> updateProduct(@PathVariable int productId, @RequestBody Product product) {
       if (!service.existsById(productId)) {
           return ResponseEntity.notFound().build();
       }
       product.setProductId(productId);
       return ResponseEntity.ok(service.updateProduct(product));
    }

    @DeleteMapping
    public ResponseEntity <Void>deleteProduct(@PathVariable int productId) {
        if (!service.existsById(productId)) {
            return ResponseEntity.notFound().build();
        }
        service.deleteProduct(productId);
        return ResponseEntity.noContent().build();
    }

}
