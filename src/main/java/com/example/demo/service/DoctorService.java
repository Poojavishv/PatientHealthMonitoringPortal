package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
