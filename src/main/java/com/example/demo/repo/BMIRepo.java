package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.BMI;


public interface BMIRepo extends JpaRepository<BMI, Long> {
	
	
}

