package com.bsaleTest.bsale.test.project.Nicolas.Martinez.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "product")
/**
 * Entidad Product con los campos id, name, url_image, price, discount
**/
public class Product {
    /**
     * Declaramos nuestra clave primaria Id
     * auto incrementativa de tipo long
     **/
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    private String name;

    private String url_image;

    private float price;

    private int discount;

    /**
     * Aqui asociamos nuestro producto en base a su cardinalidad de muchos a uno
     * muchos productos pueden tener 1 categoria y una categoria puede tener muchos productos
     **/
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="category")
    private Category category;

    public Product() {}

    public Product(String name, String url_image, float price, int discount, Category category) {
        this.name = name;
        this.url_image = url_image;
        this.price = price;
        this.discount = discount;
        this.category = category;
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


    public Category getCategory() {
        return category;
    }

}
