package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table

public class BloodCount {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    
    private Patient patient; 
    private String timeOfDay;
    private Double rbcCount;
    
  
    private Double wbcCount;
    
    private Double plateletCount;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public String getTimeOfDay() {
		return timeOfDay;
	}

	public void setTimeOfDay(String timeOfDay) {
		this.timeOfDay = timeOfDay;
	}

	public Double getRbcCount() {
		return rbcCount;
	}

	public void setRbcCount(Double rbcCount) {
		this.rbcCount = rbcCount;
	}

	public Double getWbcCount() {
		return wbcCount;
	}

	public void setWbcCount(Double wbcCount) {
		this.wbcCount = wbcCount;
	}

	public Double getPlateletCount() {
		return plateletCount;
	}

	public void setPlateletCount(Double plateletCount) {
		this.plateletCount = plateletCount;
	}

	public BloodCount() {
		super();
		this.id = id;
		this.patient = patient;
		this.timeOfDay = timeOfDay;
		this.rbcCount = rbcCount;
		this.wbcCount = wbcCount;
		this.plateletCount = plateletCount;
	}
    
    
    
}

