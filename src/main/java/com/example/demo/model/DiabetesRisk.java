package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class DiabetesRisk {
	
	@Id
	@GeneratedValue
    private int patientId;
    private String timeOfDay;
    private int rbcCount;
    private int wbcCount;
    private int plateletCount;
    // getters and setters
    
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getTimeOfDay() {
		return timeOfDay;
	}
	public void setTimeOfDay(String timeOfDay) {
		this.timeOfDay = timeOfDay;
	}
	public int getRbcCount() {
		return rbcCount;
	}
	public void setRbcCount(int rbcCount) {
		this.rbcCount = rbcCount;
	}
	public int getWbcCount() {
		return wbcCount;
	}
	public void setWbcCount(int wbcCount) {
		this.wbcCount = wbcCount;
	}
	public int getPlateletCount() {
		return plateletCount;
	}
	public void setPlateletCount(int plateletCount) {
		this.plateletCount = plateletCount;
	}
    
    
}