package com.example.demo.service;

import java.util.ArrayList;

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
	@Autowired
	BloodCountService bloodCountService;
	@Autowired
	BMIService bmiService;
	@Autowired
	CalorieIntakeService calorieIntakeService;
	@Autowired
	PressureService pressureService;
	@Autowired
	ThyroidService thyroidService;
	@Autowired
	CholestrolService cholestrolService;
	@Autowired
	GlucoseService glucoseSevice;
	
	
	public void addPatientRecordDetails(PatientRecords patientRecords)
	{
		patientRecordRepo.save(patientRecords); 
	}
	
	public void addPatientRecordDetails(String patientEmail)
	{
		BloodCount bloodCount =  bloodCountService.getByPatientId(patientEmail);
//    	System.out.println(patientEmail);
// 	ArrayList<Activity> activity=activityService.findBypatientId(patientEmail);
    	BMI bmi=bmiService.getByPatientId(patientEmail);
    	CalorieIntake calorieIntake=calorieIntakeService.getByPatientId(patientEmail);
//  	ArrayList<Diet> diet=dietService.findBypatientId(patientEmail);
    	Pressure pressure=pressureService.getByPatientId(patientEmail);
    	Thyroid thyroid=thyroidService.getByPatientId(patientEmail);
    	CholestrolMonitor cholestrolMonitor=cholestrolService.getByPatientId(patientEmail);
    	GlucoseI glucose=glucoseSevice.getByPatientId(patientEmail);
    	PatientRecords patientRecords = new PatientRecords();
    	
    	patientRecords.setPatientId(patientEmail);
    	patientRecords.setRbcCount(bloodCount.getRbcCount());
    	patientRecords.setWbcCount(bloodCount.getWbcCount());
    	patientRecords.setPlateletCount(bloodCount.getPlateletCount());
    	patientRecords.setBmi(bmi.getBmi());
    	patientRecords.setGlucoseLevel(glucose.getGlucoseLevel());;
    	patientRecords.setCalories(calorieIntake.getCalories());
    	patientRecords.setPressureLevel(pressure.getPressureLevel());
    	patientRecords.setThyroidLevel(thyroid.getThyroidLevel());
    	patientRecords.setCholestrolLevel(cholestrolMonitor.getCholestrolLevel());
    	
    	patientRecordRepo.save(patientRecords);
    	
	}
	
	public PatientRecords addPatientRecordDetails(String patientEmail,BMI bmi,GlucoseI glucose,CalorieIntake calorieIntake,BloodCount bloodCount,Thyroid thyroid,CholestrolMonitor cholestrolMonitor,Pressure pressure)
	{
		PatientRecords patientRecords = new PatientRecords();
		patientRecords.setPatientId(patientEmail);
			
		return patientRecords;
	}
	

	public ArrayList<PatientRecords> getPatientRecordsList() {
		ArrayList<PatientRecords> patientRecordsList = new ArrayList<>();
		patientRecordsList.addAll(patientRecordRepo.findAll());
		return patientRecordsList;
	}
	 public PatientRecords getById(Long patientRecId)
	 {
		 PatientRecords PatientRecordsDetails = patientRecordRepo.findById(patientRecId).orElse(new PatientRecords());
		 return PatientRecordsDetails;
	 }

	public void savePatientRecords(PatientRecords patientRecords) {
    	patientRecordRepo.save(patientRecords);
	}

	public ArrayList<PatientRecords> findBypatientId(String patientEmail) {
		ArrayList<PatientRecords> PatientRecords1 = patientRecordRepo.findBypatientId(patientEmail);
		 return PatientRecords1;
	}

}
