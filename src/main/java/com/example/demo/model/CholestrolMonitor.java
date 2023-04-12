package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table
public class CholestrolMonitor {

   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
   
    private String patientId;
    

    private String timeOfDay;
    
    
    private Double cholestrolLevel;


	

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


	public Double getCholestrolLevel() {
		return cholestrolLevel;
	}


	public void setCholestrolLevel(Double cholestrolLevel) {
		this.cholestrolLevel = cholestrolLevel;
	}


	@Override
	public String toString() {
		return "CholestrolMonitor [id=" + id + ", patientId=" + patientId + ", timeOfDay=" + timeOfDay
				+ ", cholestrolLevel=" + cholestrolLevel + "]";
	}


	


	
    
   
}

