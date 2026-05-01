package com.steve.simplewebapp.service;

import com.steve.simplewebapp.model.Product;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "iPhone17", 50000),
            new Product(102, "Smart Tv", 60000),
            new Product(103, "TCL smartTv", 30000)));

    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(int productId) {
        return products.stream()
                .filter(p -> p.getProductId() == productId)
                .findFirst()
                .orElse(new Product(101, "NOPROD", 50000));
    }


    public void addProduct(Product product) {
        products.add(product);
    }
}
