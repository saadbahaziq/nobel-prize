package com.example.JsonDbApplication.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.JsonDbApplication.domain.Prize;
import com.example.JsonDbApplication.repository.PrizeRepository;
import com.example.JsonDbApplication.service.PrizeService;

@RestController
@RequestMapping("/prizes")
public class PrizeController {

	private PrizeRepository prizeRepository;
	
	@GetMapping("{/year}")
	public Prize retrieveByYear(@PathVariable int year){
		return prizeRepository.findByYear(year);
	}
	
	@GetMapping("{/firstname/{firstname}/surname/{surname}")
	public Prize retrieveByNames(@PathVariable String firstname, @PathVariable String surname){
		return prizeRepository.findByFirstnameOrSurname(firstname, surname);
	}
	
	@GetMapping("/year/{year}/category/{category}")
	public Prize retrieveByYearAndCategory(@PathVariable int year, @PathVariable String category){
		return prizeRepository.findByYearAndCategory(year,category);
	}
	
	@GetMapping("/year/{year}/category/{category}")
	public List<Prize> retrieveByYearAndCategoryOrderByName(@PathVariable int year, @PathVariable String category){
		return prizeRepository.findByYearAndCategoryOrderByFirstnamedesc();
	}
	
}
