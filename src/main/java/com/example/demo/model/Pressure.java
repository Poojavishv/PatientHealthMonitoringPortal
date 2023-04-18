package com.example.demo.model;

import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pressure {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pressureId;
//    @Column(insertable=false, updatable=false)
    private String patientId;

    private LocalTime timeOfDayPressure;

    private Integer pressureLevel;

	

	public Long getPressureId() {
		return pressureId;
	}

	public void setPressureId(Long pressureId) {
		this.pressureId = pressureId;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	
	public LocalTime getTimeOfDayPressure() {
		return timeOfDayPressure;
	}

	public void setTimeOfDayPressure(LocalTime timeOfDayPressure) {
		this.timeOfDayPressure = timeOfDayPressure;
	}

	public Integer getPressureLevel() {
		return pressureLevel;
	}

	public void setPressureLevel(Integer pressureLevel) {
		this.pressureLevel = pressureLevel;
	}

    // getters and setters
}