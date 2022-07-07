package com.bsaleTest.bsale.test.project.Nicolas.Martinez.dto;

import com.bsaleTest.bsale.test.project.Nicolas.Martinez.models.Product;

public class ProductDTO {

    private long id;

    private String name;

    private String url_image;

    private float price;

    private int discount;

    private int category;

    public ProductDTO(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.url_image = product.getUrl_image();
        this.price = product.getPrice();
        this.discount = product.getDiscount();
        this.category = product.getCategory().getId();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUrl_image() {
        return url_image;
    }

    public float getPrice() {
        return price;
    }

    public int getDiscount() {
        return discount;
    }

    public int getCategory() {
        return category;
    }
}
