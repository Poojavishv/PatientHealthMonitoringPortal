package com.example.demo.model;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BMI {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idBMI;
//    @Column(insertable=false, updatable=false)
    private String patientId;
    private double height;
    private String dateBMI;

    private double weight;

    private double bmi;

  
	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	

	
	public Long getIdBMI() {
		return idBMI;
	}

	public void setIdBMI(Long idBMI) {
		this.idBMI = idBMI;
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
	

	

	public String getDateBMI() {
		return dateBMI;
	}

	public void setDateBMI(String dateBMI) {
		this.dateBMI = dateBMI;
	}

	@Override
	public String toString() {
		return "BMI [idBMI=" + idBMI + ", patientId=" + patientId + ", height=" + height + ", dateBMI=" + dateBMI
				+ ", weight=" + weight + ", bmi=" + bmi + "]";
	}

	
	

	
	


}

