package com.example.PetOneToOneRelationship;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PetOneToOneRelationshipApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetOneToOneRelationshipApplication.class, args);
	}

}
