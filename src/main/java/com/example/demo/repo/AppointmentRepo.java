package com.example.demo.repo;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Appointment;

public interface AppointmentRepo extends JpaRepository<Appointment,Long> {

	public ArrayList<Appointment> findBypatientId(String patientId);


	public ArrayList<Appointment> findByDoctor(String docId);



}
