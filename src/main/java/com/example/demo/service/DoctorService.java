package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Appointment;
import com.example.demo.model.Doctor;
import com.example.demo.model.Patient;
import com.example.demo.repo.DoctorRepo;
import com.example.demo.repo.PatientRepo;

@Service
public class DoctorService {
	
	@Autowired
	DoctorRepo repo;
	
	public void addDoctorDetails(Doctor doc)
	{
		repo.save(doc); 
		
	}
	
	public ArrayList<Doctor> getDoctorList()
	{
		ArrayList<Doctor> doctorList = new ArrayList<>();
		doctorList.addAll(repo.findAll());
		return doctorList;
	}
	
	public boolean doctorLoginCheck(String docEmail,String docPassword)
	{
		Doctor doc = repo.findBydocEmail(docEmail); // select * from doctor where docEamil='';
		if(doc == null)
		{
			return false;
		}
		
		else if(doc.getDocPassword().equals(docPassword))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public Doctor getSecurityQustions(String docEmail)
	{
		Doctor doctor = repo.findBydocEmail(docEmail);
		
		return doctor;
	}
	
	public boolean checkQuationAnswer(String docEmail,String docSa1,String docSa2,String docSa3)
	{
		Doctor doctorDetails = repo.findBydocEmail(docEmail);
		if(docSa1.equals(doctorDetails.getDocSa1()) && docSa2.equals(doctorDetails.getDocSa2()) && docSa3.equals(doctorDetails.getDocSa3()))
		{
			return true;
			
		}
		else 
		{
			return false;
		}
	}
	
	public void updatePassword(String docEmail,String docPassword)
	{
		Doctor doctor = repo.findBydocEmail(docEmail);
		doctor.setDocPassword(docPassword);
		repo.save(doctor);
	}
	
	
	
}