package com.pcmarket.repository;

import com.pcmarket.models.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "brand")
public interface BrandRepository extends JpaRepository<Brand,Integer> {
}
