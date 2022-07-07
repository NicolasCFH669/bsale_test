package com.bsaleTest.bsale.test.project.Nicolas.Martinez.repositories;

import com.bsaleTest.bsale.test.project.Nicolas.Martinez.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
