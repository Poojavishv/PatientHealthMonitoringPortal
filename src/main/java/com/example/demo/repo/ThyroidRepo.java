package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Thyroid;

public interface ThyroidRepo extends JpaRepository<Thyroid, Long> {

	public Thyroid findBypatientId(String patientEmail);

}
