package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Appointment;
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
	 public ArrayList<Diet> getDietList()
		{
			ArrayList<Diet> dietList = new ArrayList<>();
			dietList.addAll(dietRepository.findAll());
			return dietList;
		}
	 public Diet getById(Long id)
	 {
		 Diet DietDetails = dietRepository.findById(id).orElse(new Diet());
		 return DietDetails;
	 }

}
