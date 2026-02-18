package com.bcnd.studentback.Service;

import com.bcnd.studentback.Entity.Product;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductService {
    Map<Long,Product> products = new HashMap<>();

    public List<Product> getGreaterThan(double price) {
        return products.values()
                .stream()
                .filter(p -> p.getPrice() > price)
                .toList();
    }

}
