package com.example.demo.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.CholestrolMonitor;
import com.example.demo.model.Pressure;

@Repository
public interface PressureRepository extends JpaRepository<Pressure, Long> {

    List<Pressure> findByPatientId(String patientId);

	ArrayList<Pressure> getByPatientId(String patientEmail);

public	Pressure findBypatientId(String patientEmail);

public List<Pressure> getBypatientId(String patientId);

    // Define additional methods if required
}
