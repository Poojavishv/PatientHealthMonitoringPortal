package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.BMI;

import com.example.demo.repo.BMIRepo;

@Service
public class BMIService {
	 
	@Autowired
	BMIRepo repo;
	public void addBMIDetails(BMI bmi1)
	{
		repo.save(bmi1); 
	}
	
	public double calculateBMI(double height, double weight) {
        double bmi = weight / (height * height);
        return bmi;
    }
    public double calculateGlucose(double height, double weight) {
        double bmi = weight / (height * height);
        double glucoseLevel = 2.0*bmi;
        return glucoseLevel;
    }
   

}
