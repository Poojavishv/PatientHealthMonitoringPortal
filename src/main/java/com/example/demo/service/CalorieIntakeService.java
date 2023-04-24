package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.BMI;
import com.example.demo.model.CalorieIntake;
import com.example.demo.model.GlucoseI;
import com.example.demo.repo.CalorieRepo;

import jakarta.transaction.Transactional;


@Service
public class CalorieIntakeService {
	@Autowired
    private CalorieRepo calorieRepository;
    
    @Transactional
    public void saveCalorieCount(CalorieIntake calorieIntake) {
        calorieRepository.save(calorieIntake);
    }

	public CalorieIntake getByPatientId(String patientEmail) {
		CalorieIntake ci = calorieRepository.findBypatientId(patientEmail);
    	return ci;
	}

	public List<CalorieIntake> getcalorieIntakeReport(String patientEmail)
	    {
	    	return calorieRepository.getBypatientId(patientEmail);
	    }
}




