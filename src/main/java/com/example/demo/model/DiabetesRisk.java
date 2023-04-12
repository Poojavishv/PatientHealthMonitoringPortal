package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table

public class DiabetesRisk {
	@Id
    @GeneratedValue
    public Long diabetesId;
	
    private String patientId;
    @Autowired
    private static BloodCount bloodCount;
    // getters and setters
    
    public Long getDiabetesId() {
		return diabetesId;
	}
	public void setDiabetesId(Long diabetesId) {
		this.diabetesId = diabetesId;
	}
	
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public static BloodCount getBloodCount() {
		return bloodCount;
	}
	public static void setBloodCount(BloodCount bloodCount) {
		DiabetesRisk.bloodCount = bloodCount;
	}
	
	@Override
	public String toString() {
		return "DiabetesRisk [diabetesId=" + diabetesId + ", patientId=" + patientId + "]";
	}
	public DiabetesRisk(String patientId, BloodCount bloodCount) {
		super();
		this.patientId = patientId;
		this.bloodCount = bloodCount;
	}
	public DiabetesRisk() {
		super();
	}
	
	
	
	
}