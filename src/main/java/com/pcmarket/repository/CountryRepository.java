package com.pcmarket.repository;

import com.pcmarket.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "country")
public interface CountryRepository extends JpaRepository<Country,Integer> {
}
