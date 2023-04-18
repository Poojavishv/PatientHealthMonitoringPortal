package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Appointment;
import com.example.demo.model.BMI;
import com.example.demo.model.Doctor;
import com.example.demo.model.Patient;
import com.example.demo.model.Pressure;
import com.example.demo.repo.DoctorRepo;
import com.example.demo.repo.PatientRepo;

@Service  
public class PatientService {
	
	@Autowired
	PatientRepo repo;
	
	
	public void addPatientDetails(Patient patient)
	{
		repo.save(patient); 
	}
	
	public boolean patientLoginCheck(String patientEmail, String patientPassword) {
		
		Patient patient = repo.findBypatientEmail(patientEmail); // select * from patient where patientEamil='';
		if(patient == null)
		{
			return false;
		}
		
		else if(patient.getPatientPassword().equals(patientPassword))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	 public Patient getById(String patientEmail)
	 {
		 Patient patientDetails = repo.findBypatientEmail(patientEmail);
		 return patientDetails;
	 }

	public ArrayList<Pressure> getByPatientId(String patientEmail) {
		ArrayList<Pressure> p = repo.findBypatientId(patientEmail);
    	return p;
	}

}
