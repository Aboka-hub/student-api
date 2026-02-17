package com.bcnd.studentback.Entity;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class Product {

    private Long id;

    @NotBlank(message = "Name must not be blank")
    private String name;

    @Min(value = 0, message = "Price must be greater or equal to 0")
    private double price;


    public Product() {
    }

    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
