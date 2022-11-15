package com.pcmarket.repository;

import com.pcmarket.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "account")
public interface AccountRepository extends JpaRepository<Account,Integer> {
}
