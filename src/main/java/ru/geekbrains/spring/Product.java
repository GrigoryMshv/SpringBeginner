package ru.geekbrains.spring;

import java.math.BigDecimal;

public class Product {

    private Long productId;
    private String productTitle;
    private int productPrice;

    public Product(Long productId, String productTitle, int productPrice) {
        this.productId = productId;
        this.productTitle = productTitle;
        this.productPrice = productPrice;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }
}
