package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.CalorieIntake;
import com.example.demo.model.CholestrolMonitor;

public interface CholestrolRepo extends JpaRepository<CholestrolMonitor, Long> {

	public CholestrolMonitor findBypatientId(String patientId);
	public List<CholestrolMonitor> getBypatientId(String patientId);


}
