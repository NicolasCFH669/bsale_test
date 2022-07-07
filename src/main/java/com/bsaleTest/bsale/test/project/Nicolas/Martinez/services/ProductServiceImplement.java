package com.bsaleTest.bsale.test.project.Nicolas.Martinez.services;

import com.bsaleTest.bsale.test.project.Nicolas.Martinez.dto.ProductDTO;
import com.bsaleTest.bsale.test.project.Nicolas.Martinez.models.Product;
import com.bsaleTest.bsale.test.project.Nicolas.Martinez.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImplement {

    @Autowired
    ProductRepository productRepository;

    public List<ProductDTO> getProductsDTO () {
        return productRepository.findAll().stream().map(ProductDTO::new).collect(Collectors.toList());
    }

    public ProductDTO getProductById(Long id) {
        return productRepository.findById(id).map(ProductDTO::new).orElse(null);
    }
}
