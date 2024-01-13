package com.example.PetOneToOneRelationship;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pid;
	
	@NotBlank(message = "Person name can not be blank")
	private String pname;
	
	@OneToOne
	@JoinColumn(name = "person_id")
	private Pet3 pet3;

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Pet3 getPet3() {
		return pet3;
	}

	public void setPet3(Pet3 pet3) {
		this.pet3 = pet3;
	}

	
}
