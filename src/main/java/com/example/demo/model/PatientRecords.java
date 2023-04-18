package com.example.demo.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class PatientRecords {

	@Id
    @GeneratedValue
    private Long patientRecId;
	
//	@Column(insertable=false, updatable=false)
	private String patientId;
//	Blood Count Vlaues 
    private Double rbcCount;
    private Double wbcCount;
    private Double plateletCount;
    
//    BMI Values
    private double glucoseLevel;
    private double bmi;
    private String updatePatientRec;
    
//    Calorie Intake Values 
    private Integer calories;
    
//    Cholestrol Monitor Values
    private Double cholestrolLevel;
    
//    Pressure Values
    private Integer pressureLevel;

//    Thyroid Values
    private Double thyroidLevel;

	public Long getPatientRecId() {
		return patientRecId;
	}

	public void setPatientRecId(Long patientRecId) {
		this.patientRecId = patientRecId;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
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

	public double getGlucoseLevel() {
		return glucoseLevel;
	}

	public void setGlucoseLevel(double glucoseLevel) {
		this.glucoseLevel = glucoseLevel;
	}

	public double getBmi() {
		return bmi;
	}

	public void setBmi(double bmi) {
		this.bmi = bmi;
	}

	public Integer getCalories() {
		return calories;
	}

	public void setCalories(Integer calories) {
		this.calories = calories;
	}

	public Double getCholestrolLevel() {
		return cholestrolLevel;
	}

	public void setCholestrolLevel(Double cholestrolLevel) {
		this.cholestrolLevel = cholestrolLevel;
	}

	public Integer getPressureLevel() {
		return pressureLevel;
	}

	public void setPressureLevel(Integer pressureLevel) {
		this.pressureLevel = pressureLevel;
	}

	public Double getThyroidLevel() {
		return thyroidLevel;
	}

	public void setThyroidLevel(Double thyroidLevel) {
		this.thyroidLevel = thyroidLevel;
	}
	

	public String getUpdatePatientRec() {
		return updatePatientRec;
	}

	public void setUpdatePatientRec(String updatePatientRec) {
		this.updatePatientRec = updatePatientRec;
	}

	@Override
	public String toString() {
		return "PatientRecords [patientRecId=" + patientRecId + ", patientId=" + patientId + ", rbcCount=" + rbcCount
				+ ", wbcCount=" + wbcCount + ", plateletCount=" + plateletCount + ", glucoseLevel=" + glucoseLevel
				+ ", bmi=" + bmi + ", updatePatientRec=" + updatePatientRec + ", calories=" + calories
				+ ", cholestrolLevel=" + cholestrolLevel + ", pressureLevel=" + pressureLevel + ", thyroidLevel="
				+ thyroidLevel + "]";
	}

	


	
//	private ArrayList<Activity> activity;
//	private BMI bmi;
//	private  CalorieIntake calorieIntake;
//	private  CholestrolMonitor cholestrolMonitor;
////	private  ArrayList<Diet> diet;
//	@Autowired
//	private  BloodCount bloodcount;
//	private  Pressure pressure;
//	private  Thyroid thyroid;
	
	
	
	
}
