package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.GlucoseI;


public interface GlocoseRepo extends JpaRepository<GlucoseI,Long> {

	GlucoseI findBypatientId(String patientEmail);

	public List<GlucoseI> getBypatientId(String patientId);

	

}
