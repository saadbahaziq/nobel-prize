package com.example.JsonDbApplication.domain;

import javax.persistence.Embeddable;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Embeddable
public class Laureates {
	
	private Long id;
	private String firstname;
	private String surname;
	private String motivation;
	private int share;
	
	public Laureates(){
		
	}

}
