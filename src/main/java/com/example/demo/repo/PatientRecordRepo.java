package com.example.demo.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.PatientRecords;

public interface PatientRecordRepo extends JpaRepository<PatientRecords, Long> {

	public PatientRecords findBypatientId(String patientEmail);


	

}
