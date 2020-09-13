package ru.geekbrains.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope("prototype")
public class Cart {

    private List<Product> products;
    private ProductRepository productRepository;

    @Autowired
    public Cart(List<Product> products, ProductRepository productRepository) {
        this.products = products;
        this.productRepository = productRepository;
    }


    public void addToCart(Long id) {
        products.add(productRepository.getProductById(id));
    }

    public void removeFromCart(Long id) {
        products.remove(productRepository.getProductById(id));
    }

    public List<Product> getCartList() {
        return products;
    }

    public void clearCart() {
        products.clear();
    }


}
