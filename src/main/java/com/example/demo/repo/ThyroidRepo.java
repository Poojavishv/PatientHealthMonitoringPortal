package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Pressure;
import com.example.demo.model.Thyroid;

public interface ThyroidRepo extends JpaRepository<Thyroid, Long> {

	public Thyroid findBypatientId(String patientEmail);

	public List<Thyroid> getBypatientId(String patientId);

}
