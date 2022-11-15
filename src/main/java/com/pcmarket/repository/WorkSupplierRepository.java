package com.pcmarket.repository;


import com.pcmarket.models.WorkSupplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "workSupplier")
public interface WorkSupplierRepository extends JpaRepository<WorkSupplier,Integer> {
}
