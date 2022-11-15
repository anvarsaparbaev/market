package com.pcmarket.repository;

import com.pcmarket.models.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "blog")
public interface BlogRepository extends JpaRepository<Blog,Integer> {
}
