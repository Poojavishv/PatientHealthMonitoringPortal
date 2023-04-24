package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.model.BloodCount;
import com.example.demo.model.DiabetesRisk;
import com.example.demo.model.Thyroid;
import com.example.demo.repo.DiabetesRiskRepository;

@Service
public class DiabetesRiskService {
	
	@Autowired
	DiabetesRiskRepository diabetesRiskRepository;
	
	public void addDiabetesRiskDetails(DiabetesRisk diabetesRisk2)
	{
		diabetesRiskRepository.save(diabetesRisk2); 
	}
    public double calculateRisk(BloodCount bloodCount,String patientEmail) {
    	double diabetesRisk1 = 0;
    	diabetesRisk1 =  bloodCount.getRbcCount() + bloodCount.getWbcCount() + bloodCount.getPlateletCount() ;
    	DiabetesRisk risk=new DiabetesRisk();
    	risk.setPatientId(patientEmail);
    	risk.setDiabetesRisk1(new Double(diabetesRisk1).toString());
    	diabetesRiskRepository.save(risk);
		return diabetesRisk1;
        
        
    }
	
    
}