package com.pcmarket.repository;

import com.pcmarket.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "address")
public interface AddressRepository extends JpaRepository<Address,Integer> {
}
