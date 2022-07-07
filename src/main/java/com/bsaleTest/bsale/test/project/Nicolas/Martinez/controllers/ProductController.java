package com.bsaleTest.bsale.test.project.Nicolas.Martinez.controllers;

import com.bsaleTest.bsale.test.project.Nicolas.Martinez.dto.ProductDTO;
import com.bsaleTest.bsale.test.project.Nicolas.Martinez.models.Product;
import com.bsaleTest.bsale.test.project.Nicolas.Martinez.services.ProductServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductServiceImplement productServiceImplement;

    /**
     * endpoint de metodo get
     * que retorna todos los productos
     * **/
    @GetMapping("/products")
    public List<ProductDTO > getProducts() {
        return  productServiceImplement.getProductsDTO();
    }
    /**
     * endpoint de metodo get
     * que retorna un producto en base al id
     * **/
    @GetMapping("/product/{id}")
    public ProductDTO getProduct(@PathVariable Long id) {
        return productServiceImplement.getProductById(id);
    }

    /**
     * endpoint de metodo get
     * que retorna una categoria basado en el id de categoria
     * **/
    @GetMapping("/categories/{category}")
    public List<ProductDTO> getCategoryProducts(@PathVariable Long category) {
        List<Product> listaProductos = productServiceImplement.getCategory(category);
        List <ProductDTO> listaProductDTO =  listaProductos.stream().map(ProductDTO::new).collect(Collectors.toList());
        return listaProductDTO;
    }
}
