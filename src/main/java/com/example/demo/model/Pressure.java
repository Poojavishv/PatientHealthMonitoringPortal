package com.example.demo.model;

import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pressure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String patientId;

    private LocalTime timeOfDay;

    private Integer pressureLevel;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public LocalTime getTimeOfDay() {
		return timeOfDay;
	}

	public void setTimeOfDay(LocalTime timeOfDay) {
		this.timeOfDay = timeOfDay;
	}

	public Integer getPressureLevel() {
		return pressureLevel;
	}

	public void setPressureLevel(Integer pressureLevel) {
		this.pressureLevel = pressureLevel;
	}

    // getters and setters
}