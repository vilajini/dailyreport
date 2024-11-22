package com.example.dailyreport;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "name", length = 100, nullable = false)
    private String name;

    @Column(name = "price", nullable = false, precision = 10, scale = 2)
    private Double price;
}
