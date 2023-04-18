package com.example.demo.repo;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.PatientRecords;

public interface PatientRecordRepo extends JpaRepository<PatientRecords, Long> {

	public ArrayList<PatientRecords> findBypatientId(String patientEmail);

}
