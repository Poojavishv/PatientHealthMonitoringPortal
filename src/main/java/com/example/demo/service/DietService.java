package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Diet;
import com.example.demo.repo.DietRepo;

import jakarta.transaction.Transactional;

@Service
public class DietService {
	@Autowired
	private DietRepo dietRepository;
	
	 @Transactional
	    public void saveDietDetails(Diet diet) {
		 dietRepository.save(diet);
	 }

}
