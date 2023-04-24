package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.CholestrolMonitor;
import com.example.demo.model.GlucoseI;
import com.example.demo.repo.CholestrolRepo;


import jakarta.transaction.Transactional;

@Service 
public class CholestrolService {
	@Autowired
private CholestrolRepo chlolestrolRepository;
    
    @Transactional
    public void saveDetails(CholestrolMonitor cholestrolMonitor) {
    	chlolestrolRepository.save(cholestrolMonitor);
    }

	public CholestrolMonitor getByPatientId(String patientEmail) {
		CholestrolMonitor cholestrolMonitor=chlolestrolRepository.findBypatientId(patientEmail);
		return cholestrolMonitor;
	}

	 public List<CholestrolMonitor> getcholestrolMonitorReport(String patientEmail)
	    {
	    	return chlolestrolRepository.getBypatientId(patientEmail);
	    }

}
