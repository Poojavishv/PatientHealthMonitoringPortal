package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Appointment;
import com.example.demo.model.Doctor;
import com.example.demo.model.Patient;
import com.example.demo.repo.AppointmentRepo;

import jakarta.transaction.Transactional;

@Service
public class AppointmentService {
	@Autowired
    private AppointmentRepo appointmentRepo;
	 @Transactional
	    public void saveAppointment(Appointment appointment) {
		 appointmentRepo.save(appointment);
	 }

	 public ArrayList<Appointment> getAppointmentList()
		{
			ArrayList<Appointment> appointmentList = new ArrayList<>();
			appointmentList.addAll(appointmentRepo.findAll());
			return appointmentList;
		}
	 public Appointment getById(Long appointmentId)
	 {
		 Appointment appointmentDetails = appointmentRepo.findById(appointmentId).orElse(new Appointment());
		 return appointmentDetails;
	 }
	 

	public ArrayList<Appointment> findBypatientId(String patientId) {
		ArrayList<Appointment> appointmentDetails1 = appointmentRepo.findBypatientId(patientId);
		 return appointmentDetails1;
		
	}

	
	 
}
