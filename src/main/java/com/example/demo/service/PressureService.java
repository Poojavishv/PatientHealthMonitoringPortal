package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.CholestrolMonitor;
import com.example.demo.model.Pressure;
import com.example.demo.repo.PressureRepository;

import jakarta.transaction.Transactional;

@Service
public class PressureService {
	@Autowired
	PressureRepository pressureRepo;
	

	public Pressure getByPatientId(String patientEmail) {
		Pressure pressure=pressureRepo.findBypatientId(patientEmail);
		return pressure;
	}


	 public List<Pressure> getpressureReport(String patientEmail)
	    {
	    	return pressureRepo.getBypatientId(patientEmail);
	    }
	

}
