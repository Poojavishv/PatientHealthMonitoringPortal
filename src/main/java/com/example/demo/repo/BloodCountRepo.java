package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.BloodCount;

public interface BloodCountRepo extends JpaRepository<BloodCount, Long> {
	
	public BloodCount findBypatientId(String patientId);

}

