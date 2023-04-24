package com.example.demo.service;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.model.Diet;
import com.example.demo.model.Doctor;
import com.example.demo.repo.DietRepo;
import com.example.demo.repo.DoctorRepo;

import jakarta.transaction.Transactional;

@Service
public class DietService {
	@Autowired
	private DietRepo dietRepository;
	@Autowired
	private DoctorRepo doctorRepo;
	
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
		 Diet dietDetails = dietRepository.findById(id).orElse(new Diet());
		 return dietDetails;
	 }
	public ArrayList<Diet> findBypatientId(String patientId) {
		ArrayList<Diet> dietDetails1 = dietRepository.findBypatientId(patientId);
		 return dietDetails1;
	}
	public ArrayList<Diet> getDietByDoctorList(String docId)
	{
		
				return dietRepository.findByDoctor(docId);
		
	}


}
