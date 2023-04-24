package com.example.demo.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.BMI;


public interface BMIRepo extends JpaRepository<BMI, Long> {

	public BMI findBypatientId(String patientEmail);
	
	public List<BMI> getByPatientId(String patientEmail);
		
}

