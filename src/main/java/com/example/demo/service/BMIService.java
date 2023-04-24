package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.BMI;
import com.example.demo.model.BloodCount;
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
    

	public BMI getByPatientId(String patientEmail) {
	BMI b = repo.findBypatientId(patientEmail);
    	return b;
	}
	
	public List<BMI> getBMIReport(String patientEmail)
	{
		List<BMI> bmiListValues = repo.getByPatientId(patientEmail);
		return bmiListValues;
	}
//	
	
	/*public List<BMI> getBMIListByPatientId(String patientEmail) {
		List<BMI> bmiList = new ArrayList<>();
		bmiList.addAll(repo.findBypatientId(patientEmail));
//		BMI b = repo.findBypatientId(patientEmail);
    	return bmiList;
	}*/
	
   

}
