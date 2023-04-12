package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.BloodCount;
import com.example.demo.repo.BloodCountRepo;

import jakarta.transaction.Transactional;

@Service
public class BloodCountService {
    
    @Autowired
    private BloodCountRepo bloodCountRepository;
    
    @Transactional
    public void saveBloodCount(BloodCount bloodCount) {
        bloodCountRepository.save(bloodCount);
    }
    
    public BloodCount getByPatientId(String patientEmail)
    {
    	BloodCount bc = bloodCountRepository.findBypatientId(patientEmail);
    	return bc;
    }
}


