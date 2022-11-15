package com.pcmarket.repository;

import com.pcmarket.models.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "card")
public interface CardRepository extends JpaRepository<Card,Integer> {
}
