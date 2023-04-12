package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.BloodCount;
import com.example.demo.model.DiabetesRisk;
import com.example.demo.repo.DiabetesRiskRepository;

@Service
public class DiabetesRiskService {
	
	@Autowired
	DiabetesRiskRepository diabetesRiskRepository;
	
	
    public double calculateRisk(BloodCount bloodCount) {
    	double diabetesRisk1 = 0;
    	diabetesRisk1 =  bloodCount.getRbcCount() + bloodCount.getWbcCount() + bloodCount.getPlateletCount() ;
    	
		return diabetesRisk1;
        
        
    }
}