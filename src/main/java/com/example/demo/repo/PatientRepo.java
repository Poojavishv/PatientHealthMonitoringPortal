package com.example.demo.repo;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Appointment;
import com.example.demo.model.Doctor;
import com.example.demo.model.Patient;
import com.example.demo.model.Pressure;

public interface PatientRepo extends JpaRepository<Patient, Long> {
	

	public Patient findBypatientEmail(String patientEmail);


}
