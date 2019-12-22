package com.example.JsonDbApplication.domain;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Prize {
	@Id
    @GeneratedValue( strategy = GenerationType.AUTO )
	private Long iden;
	private int year;
	private String category;
	private String overallMotivation;
	
	@Embedded
	private Laureates laureates;
	public Prize(){}
}
