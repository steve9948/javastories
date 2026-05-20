package com.steve.simplewebapp.service;

import com.steve.simplewebapp.model.Product;
import com.steve.simplewebapp.repository.ProductRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Getter
@Service
public class ProductService {

    @Autowired
    ProductRepository repo;

//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101, "iPhone17", 50000),
//            new Product(102, "Smart Tv", 60000),
//            new Product(103, "TCL smartTv", 30000)));

    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductById(int productId) {
        return repo.findById(productId).orElse(null);
    }

    public Product addProduct(Product product) {
        return repo.save(product);
    }

    public Product updateProduct(Product product) {
        return repo.save(product);
    }

    public void deleteProduct(int productId) {
        repo.deleteById(productId);
    }

    public boolean existsById(int productId) {
        return repo.existsById(productId);
    }
}
