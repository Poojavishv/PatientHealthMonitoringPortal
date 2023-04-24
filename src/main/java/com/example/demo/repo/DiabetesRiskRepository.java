package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.DiabetesRisk;


public interface DiabetesRiskRepository extends JpaRepository<DiabetesRisk, Long> {

	List<DiabetesRisk> getBypatientId(String patientEmail);
	
}