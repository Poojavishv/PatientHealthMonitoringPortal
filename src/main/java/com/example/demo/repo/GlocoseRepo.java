package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.GlucoseI;

public interface GlocoseRepo extends JpaRepository<GlucoseI,Long> {

	GlucoseI findBypatientId(String patientEmail);

}
