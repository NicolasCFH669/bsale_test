package com.bsaleTest.bsale.test.project.Nicolas.Martinez.controllers;

import com.bsaleTest.bsale.test.project.Nicolas.Martinez.dto.CategoryDTO;
import com.bsaleTest.bsale.test.project.Nicolas.Martinez.services.CategoryServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoryController {

    @Autowired
    private CategoryServiceImplement  categoryServiceImplement;

    @GetMapping("/categories")
    public List<CategoryDTO> getCategories() {
        return categoryServiceImplement.getCategoryDTO();
    }
}
