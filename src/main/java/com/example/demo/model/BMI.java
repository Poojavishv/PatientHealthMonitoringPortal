package com.example.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BMI {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String patientId;
    private double glucoseLevel;
    private double height;
    private String date;

    private double weight;

    private double bmi;

  
	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public double getGlucoseLevel() {
		return glucoseLevel;
	}

	public void setGlucoseLevel(double glucoseLevel) {
		this.glucoseLevel = glucoseLevel;
	}

    

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getBmi() {
		return bmi;
	}

	public void setBmi(double bmi) {
		this.bmi = bmi;
	}
	

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "BMI [id=" + id + ", patientId=" + patientId + ", glucoseLevel=" + glucoseLevel + ", height=" + height
				+ ", date=" + date + ", weight=" + weight + ", bmi=" + bmi + "]";
	}

	

	
	


}

