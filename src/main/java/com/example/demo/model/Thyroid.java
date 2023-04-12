package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Thyroid {    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
   
    private String patientId;
    

    private String timeOfDay;
    
    
    private Double thyroidLevel;


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


	public String getTimeOfDay() {
		return timeOfDay;
	}


	public void setTimeOfDay(String timeOfDay) {
		this.timeOfDay = timeOfDay;
	}


	public Double getThyroidLevel() {
		return thyroidLevel;
	}


	public void setThyroidLevel(Double thyroidLevel) {
		this.thyroidLevel = thyroidLevel;
	}


	@Override
	public String toString() {
		return "Thyroid [id=" + id + ", patientId=" + patientId + ", timeOfDay=" + timeOfDay + ", thyroidLevel="
				+ thyroidLevel + "]";
	}


	
    
   
}

