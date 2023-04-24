package com.example.demo.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
	@Autowired
	DoctorRepo doctorRepo;
	
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

	
	
	public List<Patient> getPatientList()
	{
		List<Patient> patientList = repo.findAll();
		
		return patientList;
	}
	
	public Patient getSecurityQuestions(String patientEmail) {
		Patient patient =repo.findBypatientEmail(patientEmail);
		return patient;
	}
	
	public boolean checkQuationAnswerPatient(String patientEmail,String paSa1,String paSa2,String paSa3)
	{
		Patient patientDetails = repo.findBypatientEmail(patientEmail);
		if(paSa1.equals(patientDetails.getPaSa1()) && paSa2.equals(patientDetails.getPaSa2()) && paSa3.equals(patientDetails.getPaSa3()))
		{
			return true;
			
		}
		else 
		{
			return false;
		}
	}
	
	public void updatePatientPassword(String patientEmail,String patientPassword)
	{
		Patient patient =repo.findBypatientEmail(patientEmail);
		patient.setPatientPassword(patientPassword);
		repo.save(patient);
	}


}
