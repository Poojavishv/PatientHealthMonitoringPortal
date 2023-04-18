package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
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
    private Long thyroidId;
    
//    @Column(insertable=false, updatable=false)
    private String patientId;
    

    private String timeOfDayThyroid;
    
    
    private Double thyroidLevel;


	


	public Long getThyroidId() {
		return thyroidId;
	}


	public void setThyroidId(Long thyroidId) {
		this.thyroidId = thyroidId;
	}


	public String getPatientId() {
		return patientId;
	}


	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}


	


	public String getTimeOfDayThyroid() {
		return timeOfDayThyroid;
	}


	public void setTimeOfDayThyroid(String timeOfDayThyroid) {
		this.timeOfDayThyroid = timeOfDayThyroid;
	}


	public Double getThyroidLevel() {
		return thyroidLevel;
	}


	public void setThyroidLevel(Double thyroidLevel) {
		this.thyroidLevel = thyroidLevel;
	}


	@Override
	public String toString() {
		return "Thyroid [id=" + thyroidId + ", patientId=" + patientId + ", timeOfDay=" + timeOfDayThyroid + ", thyroidLevel="
				+ thyroidLevel + "]";
	}


	
    
   
}

