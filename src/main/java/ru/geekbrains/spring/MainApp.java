package ru.geekbrains.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Cart cart = context.getBean("cart", Cart.class);
        cart.addToCart(2L);
        cart.addToCart(3L);
        cart.addToCart(4L);

        System.out.println(cart.getCartList());

        cart.removeFromCart(3L);

        System.out.println(cart.getCartList());

        context.close();
    }
}
