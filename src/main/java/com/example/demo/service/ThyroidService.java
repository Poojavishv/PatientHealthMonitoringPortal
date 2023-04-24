package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.BMI;
import com.example.demo.model.Pressure;
import com.example.demo.model.Thyroid;
import com.example.demo.repo.ThyroidRepo;

import jakarta.transaction.Transactional;

@Service
public class ThyroidService {
    
    @Autowired
    private ThyroidRepo thyroidRepository;
    
    @Transactional
    public void saveThyroidDetails(Thyroid thyroid) {
        thyroidRepository.save(thyroid);
    }

	public Thyroid getByPatientId(String patientEmail) {
		Thyroid T = thyroidRepository.findBypatientId(patientEmail);
    	return T;
	}

	public List<Thyroid> getthyroidReport(String patientEmail)
	    {
	    	return thyroidRepository.getBypatientId(patientEmail);
	    }
}
