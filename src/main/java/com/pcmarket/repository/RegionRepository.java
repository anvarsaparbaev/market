package com.pcmarket.repository;


import com.pcmarket.models.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "region")
public interface RegionRepository extends JpaRepository<Region,Integer> {
}
