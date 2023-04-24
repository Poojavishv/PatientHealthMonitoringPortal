package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.BloodCount;

public interface BloodCountRepo extends JpaRepository<BloodCount, Long> {
	
	public BloodCount findBypatientId(String patientId);
	
	public List<BloodCount> getBypatientId(String patientId);

}