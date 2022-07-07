package com.bsaleTest.bsale.test.project.Nicolas.Martinez.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "category")
/**
 * Entidad Category con los campos id, name
 **/
public class Category {
    /**
     * Declaramos nuestra clave primaria Id
     * auto incrementativa de tipo long
     **/
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Long id;

    private String name;

    /**
     * Aqui asociamos nuestro producto en base a su cardinalidad de uno a muchos
     * una categoria puede tener muchos productos y un producto puede tener muchas categorias
     **/
    @OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
    private Set<Product> product = new HashSet<>();

    public Category() {};

    public Category(String name) {

        this.name = name;
    }

    /**
     * Getters
     * No necesitamos setters ya que solo mostramos la data de la bbdd de bsale
     * **/
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public Set<Product> getProduct() {
        return product;
    }
}
