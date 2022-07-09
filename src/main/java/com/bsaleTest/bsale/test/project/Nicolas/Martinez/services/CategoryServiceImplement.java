package com.bsaleTest.bsale.test.project.Nicolas.Martinez.services;

import com.bsaleTest.bsale.test.project.Nicolas.Martinez.dto.CategoryDTO;
import com.bsaleTest.bsale.test.project.Nicolas.Martinez.dto.ProductDTO;
import com.bsaleTest.bsale.test.project.Nicolas.Martinez.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Declaramos este Service para desacoplar la logica del controlador y separar de manera optima
 * Traemos nuestro Repositorio para consultar a nuestra bbdd y realizar busquedas en base a nuestros criterios
 * **/
@Service
public class CategoryServiceImplement {

    @Autowired
    CategoryRepository categoryRepository;

    public List<CategoryDTO> getCategoryDTO () {
        return categoryRepository.findAll().stream().map(CategoryDTO::new).collect(Collectors.toList());
    }
}
