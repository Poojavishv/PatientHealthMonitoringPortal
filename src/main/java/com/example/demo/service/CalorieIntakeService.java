package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.CalorieIntake;
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
}



