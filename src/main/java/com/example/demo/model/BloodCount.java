package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class BloodCount {
   
	
    @Id
    @GeneratedValue
    private Long bloodCountId;
    private String patientId;
    private String timeOfDay;
    private Double rbcCount;
    private Double wbcCount;
    private Double plateletCount;
    
    public Long getBloodCountId() {
		return bloodCountId;
	}
	public void setBloodCountId(Long bloodCountId) {
		this.bloodCountId = bloodCountId;
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
	@Override
	public String toString() {
		return "BloodCount [bloodCountId=" + bloodCountId + ", patientId=" + patientId + ", timeOfDay=" + timeOfDay + ", rbcCount="
				+ rbcCount + ", wbcCount=" + wbcCount + ", plateletCount=" + plateletCount + "]";
	}
	
    
    

	
    
    
}

