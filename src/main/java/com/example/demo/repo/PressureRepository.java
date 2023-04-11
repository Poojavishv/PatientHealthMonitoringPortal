package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Pressure;

@Repository
public interface PressureRepository extends JpaRepository<Pressure, Long> {

    List<Pressure> findByPatientId(String patientId);

    // Define additional methods if required
}
