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
    
    private String patientId;
   
    private String timeOfDay;
    private Double rbcCount;
    
  
    private Double wbcCount;
    
    @Override
	public String toString() {
		return "BloodCount [id=" + id + ", patientId=" + patientId + ", timeOfDay=" + timeOfDay + ", rbcCount="
				+ rbcCount + ", wbcCount=" + wbcCount + ", plateletCount=" + plateletCount + "]";
	}

	private Double plateletCount;

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	
    
    
}

