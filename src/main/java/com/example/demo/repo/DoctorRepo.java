package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Doctor;

public interface DoctorRepo extends JpaRepository<Doctor, Long> {
	
	public Doctor findBydocEmail(String docEmail);
	
} 
