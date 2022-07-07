package com.bsaleTest.bsale.test.project.Nicolas.Martinez.controllers;

import com.bsaleTest.bsale.test.project.Nicolas.Martinez.dto.ProductDTO;
import com.bsaleTest.bsale.test.project.Nicolas.Martinez.repositories.CategoryRepository;
import com.bsaleTest.bsale.test.project.Nicolas.Martinez.services.ProductServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductServiceImplement productServiceImplement;

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/products")
    public List<ProductDTO > getProducts() {
        return  productServiceImplement.getProductsDTO();
    }

    @GetMapping("/product/{id}")
    public ProductDTO getProduct(@PathVariable Long id) {
        return productServiceImplement.getProductById(id);
    }
}
