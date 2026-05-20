package com.steve.simplewebapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@Getter
@AllArgsConstructor
@Component
@Entity
public class Product {
    @Id
    private int productId;
    private String prodName;
    private int price;


}
