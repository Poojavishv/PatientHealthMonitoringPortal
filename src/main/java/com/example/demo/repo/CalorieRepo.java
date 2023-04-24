package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.CalorieIntake;
import com.example.demo.model.GlucoseI;

public interface CalorieRepo extends JpaRepository<CalorieIntake, Long> {

	public CalorieIntake findBypatientId(String patientEmail);

	public List<CalorieIntake> getBypatientId(String patientId);

}

