package com.example.PetOneToOneRelationship;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "pet3", path = "pet3")
public interface PetRepository extends JpaRepository<Pet3, Long>{

}
