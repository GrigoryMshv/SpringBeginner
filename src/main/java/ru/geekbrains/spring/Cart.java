package ru.geekbrains.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class Cart {

    private Product product;
    private List<Product> products;
    private ProductRepository productRepository;

    public Cart() {
        products = new ArrayList<>();
    }

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addToCart(Long productId) {
        products.add(productRepository.getProductById(productId));
    }

    public void removeFromCart(Long productId) {
        products.remove(productRepository.getProductById(productId));
    }

    public List<Product> getCartList() {
        return productRepository.findAll();
    }

    public void clearCart() {
        products.clear();
    }
}
