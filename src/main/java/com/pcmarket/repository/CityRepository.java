package com.pcmarket.repository;


import com.pcmarket.models.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "city")
public interface CityRepository extends JpaRepository<City,Integer> {
}
