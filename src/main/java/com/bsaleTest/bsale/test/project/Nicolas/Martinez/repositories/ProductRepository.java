package com.bsaleTest.bsale.test.project.Nicolas.Martinez.repositories;

import com.bsaleTest.bsale.test.project.Nicolas.Martinez.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository <Product, Long>{
    List<Product> findAllByCategory(Long category);
}
