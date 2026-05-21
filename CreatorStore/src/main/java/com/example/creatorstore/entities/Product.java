package com.example.creatorstore.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    @Column(nullable = false, unique = true)
    @NotBlank(message = "Product name cannot be blank")
    private String name;
    private String description;
    private String category;
    @Column(nullable = false)
    @DecimalMin(value = "0.0", inclusive = false, message = "Product price must be greater than 0")
    @NotBlank(message = "Product price is required")
    private BigDecimal price;
    @NotBlank(message = "Stock quantity is required")
    @Min(value = 0, message = "Stocks cannot be less than 0")
    @Column(name = "stock_quantity", nullable = false)
    private int stockQuantity;

    @JsonIgnore
    @OneToMany(mappedBy = "product")
    private List<OrderItem> OrderItems;
}
