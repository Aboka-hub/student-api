package com.bcnd.studentback.Entity;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class Todo {


    private Long id;

    @NotBlank(message = "Name must not be blank")
    private String name;

    @Min(value = 0, message = "Price must be greater or equal to 0")
    private double price;

}
