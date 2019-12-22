package com.example.JsonDbApplication;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.JsonDbApplication.domain.Prize;
import com.example.JsonDbApplication.service.PrizeService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class JsonDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsonDbApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(PrizeService prizeService){
		return args -> {
		//read json and write to db 
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<Prize>> typeReference = new TypeReference<List<Prize>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/sample.json");
			try{
				List<Prize> prizes = mapper.readValue(inputStream, typeReference);
				prizeService.save(prizes);
				System.out.println("prizes are saved!!");
			} catch(IOException e){
				System.out.println("unable to save "+e.getMessage());
			}
			
		};
	}
}
