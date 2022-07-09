package com.bsaleTest.bsale.test.project.Nicolas.Martinez.dto;

import com.bsaleTest.bsale.test.project.Nicolas.Martinez.models.Category;

public class CategoryDTO {

    /**
     * DTO Data Transfer Object
     * que retorna una Categoria con las siguientes campos
     *  id, name
     * **/

    private Long id;

    private String name;

    /**
     * Constructor del DTO CategoryDTO
     * esta es la data que veremos reflejada en nuestra API
     * /api/**
     * **/

    public CategoryDTO(Category category) {
        this.id = category.getId();
        this.name = category.getName();
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
}
