package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Appointment;
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

}
