package com.example.demo.repo;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Appointment;

public interface AppointmentRepo extends JpaRepository<Appointment,Long> {

	public ArrayList<Appointment> findBypatientId(String patientId);

}
