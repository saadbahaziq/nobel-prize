package com.example.JsonDbApplication.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.JsonDbApplication.domain.Prize;

public interface PrizeRepository extends CrudRepository<Prize,Long> {

	Prize findByYear(int year);

	Prize findByYearAndCategory(int year, String category);

	Prize findByFirstnameOrSurname(String firstname, String surname);
	
	List<Prize> findByYearAndCategoryOrderByFirstnamedesc();

}
