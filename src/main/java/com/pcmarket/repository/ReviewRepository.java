package com.pcmarket.repository;


import com.pcmarket.models.Region;
import com.pcmarket.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "review")
public interface ReviewRepository extends JpaRepository<Review,Integer> {
}
