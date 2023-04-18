package com.example.demo.model;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class GlucoseI {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idGlucose;
    private String patientId;
    private double glucoseLevel;
   
    private String dateGlucose;

	public Long getIdGlucose() {
		return idGlucose;
	}

	public void setIdGlucose(Long idGlucose) {
		this.idGlucose = idGlucose;
	}

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

	public String getDateGlucose() {
		return dateGlucose;
	}

	public void setDateGlucose(String dateGlucose) {
		this.dateGlucose = dateGlucose;
	}

	@Override
	public String toString() {
		return "GlucoseI [idGlucose=" + idGlucose + ", patientId=" + patientId + ", glucoseLevel=" + glucoseLevel
				+ ", dateGlucose=" + dateGlucose + "]";
	}

   

  

}

