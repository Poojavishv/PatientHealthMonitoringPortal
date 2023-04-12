package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.DiabetesRisk;
import com.example.demo.model.Patient;

public interface DiabetesRepo extends JpaRepository<DiabetesRisk, Long> {

	
}
