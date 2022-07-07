package com.bsaleTest.bsale.test.project.Nicolas.Martinez.dto;

import com.bsaleTest.bsale.test.project.Nicolas.Martinez.models.Product;

public class ProductDTO {

    /**
     * DTO Data Transfer Object
     * que retorna un producto con las siguientes props
     *  id, name, url_image, price, discount, category (asociado al id de categoria)
     * **/
    private long id;

    private String name;

    private String url_image;

    private float price;

    private int discount;

    private Long category;

    /**
     * Constructor del DTO ProductDTO
     * esta es la data que veremos reflejada en nuestra API
     * /api/**
     * **/
    public ProductDTO(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.url_image = product.getUrl_image();
        this.price = product.getPrice();
        this.discount = product.getDiscount();
        this.category = product.getCategory().getId();
    }

    /**
     * Getters
     * No necesitamos setters ya que solo mostramos la data de la bbdd de bsale
     * **/
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

    public Long getCategory() {
        return category;
    }
}
