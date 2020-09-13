package ru.geekbrains.spring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class ProductRepository {

    private List<Product> products;

    @PostConstruct
    public void init() {
        products = new ArrayList<>(Arrays.asList(
                new Product(1L, "Bread", 25),
                new Product(2L, "Milk", 90),
                new Product(3L, "Cheese", 525),
                new Product(4L, "Eggs", 95),
                new Product(5L, "Meat", 950)
        ));
    }

    public List<Product> findAll() {
        return Collections.unmodifiableList(products);
    }

    public Product getProductById(Long id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        throw new RuntimeException("Product not found");
    }
}
