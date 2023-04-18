package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.CholestrolMonitor;

public interface CholestrolRepo extends JpaRepository<CholestrolMonitor, Long> {

	public CholestrolMonitor findBypatientId(String patientId);

}
