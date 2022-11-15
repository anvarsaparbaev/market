package com.pcmarket.repository;


import com.pcmarket.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "product")
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
