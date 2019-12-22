package com.example.JsonDbApplication.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.JsonDbApplication.domain.Prize;
import com.example.JsonDbApplication.repository.PrizeRepository;

@Service
public class PrizeService { 
	
	private PrizeRepository prizeRepository;
	public Iterable<Prize> list(){
		return prizeRepository.findAll();
	}
	
	public Prize save(Prize prize){
		return prizeRepository.save(prize);
	}

	public Iterable<Prize> save(List<Prize> prizes) {
		return prizeRepository.saveAll(prizes);
	}

}
