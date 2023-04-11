package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Diabetes;
import com.example.demo.repo.DiabetesRepo;

import jakarta.transaction.Transactional;

@Service
public class DiabetesService {

	@Autowired
	private DiabetesRepo diabRepo;
	@Transactional
    public void saveDiabetesDetails(Diabetes diabetes) {
		diabRepo.save(diabetes);
	}
	
	
	    public double calculateRisk(double bmi, double glucoseLevel, double wbcCount, double rbcCount) {
	        double risk = 0.0;

	        // Calculate BMI factor
	        double bmiFactor = 0.0;
	        if (bmi >= 25 && bmi < 30) {
	            bmiFactor = 1.5;
	        } else if (bmi >= 30) {
	            bmiFactor = 2.0;
	        }
	        risk += bmiFactor;

	        // Calculate glucose factor
	        double glucoseFactor = 0.0;
	        if (glucoseLevel >= 110 && glucoseLevel < 126) {
	            glucoseFactor = 1.5;
	        } else if (glucoseLevel >= 126) {
	            glucoseFactor = 2.0;
	        }
	        risk += glucoseFactor;

	        // Calculate white blood cell count factor
	        double wbcFactor = 0.0;
	        if (wbcCount >= 9.0 && wbcCount < 11.0) {
	            wbcFactor = 1.0;
	        } else if (wbcCount >= 11.0) {
	            wbcFactor = 2.0;
	        }
	        risk += wbcFactor;

	        // Calculate red blood cell count factor
	        double rbcFactor = 0.0;
	        if (rbcCount < 4.5 || rbcCount > 5.5) {
	            rbcFactor = 2.0;
	        }
	        risk += rbcFactor;

	        // Convert the risk to a percentage
	        risk *= 10.0;

	        // Ensure that the risk is between 0 and 100
	        risk = Math.max(risk, 0.0);
	        risk = Math.min(risk, 100.0);

	        return risk;
	    }
	}



