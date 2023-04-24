package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Activity;
import com.example.demo.model.Appointment;
import com.example.demo.model.BMI;
import com.example.demo.model.BloodCount;
import com.example.demo.model.CalorieIntake;
import com.example.demo.model.CholestrolMonitor;
import com.example.demo.model.Diet;
import com.example.demo.model.GlucoseI;
import com.example.demo.model.PatientRecords;
import com.example.demo.model.Pressure;
import com.example.demo.model.Thyroid;
import com.example.demo.repo.BloodCountRepo;
import com.example.demo.repo.PatientRecordRepo;

@Service
public class PatientRecordService {
	@Autowired
	PatientRecordRepo patientRecordRepo;
	
	
	

	public void savePatientRecords(PatientRecords patientRecords) {
    	patientRecordRepo.save(patientRecords);
	}

	public PatientRecords findBypatientId(String patientEmail) {
		PatientRecords PatientRecords = patientRecordRepo.findBypatientId(patientEmail);
		 return PatientRecords;
	}

	
}
