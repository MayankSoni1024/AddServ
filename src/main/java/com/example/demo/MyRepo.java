package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;
import java.util.Optional;


@RepositoryRestResource(collectionResourceRel = "address", path = "address")
public interface MyRepo extends JpaRepository<Address, Integer> {
	Optional<Address> findByHno(int hno);
}
