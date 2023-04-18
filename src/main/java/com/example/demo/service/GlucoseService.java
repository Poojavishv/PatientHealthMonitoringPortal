package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.GlucoseI;
import com.example.demo.model.Thyroid;
import com.example.demo.repo.GlocoseRepo;
import com.example.demo.repo.ThyroidRepo;

import jakarta.transaction.Transactional;

@Service
public class GlucoseService {
	 
    @Autowired
    private GlocoseRepo repo;
    
    @Transactional
    public void saveGlucoseDetails(GlucoseI Glucose) {
    	repo.save(Glucose);
    }

	public GlucoseI getByPatientId(String patientEmail) {
		GlucoseI T = repo.findBypatientId(patientEmail);
    	return T;
	}

}
