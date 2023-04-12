package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity 
public class Appointment {
	@Id
	@GeneratedValue
	private Long id;
	
	
	private String patientId;
	private String patientName;
	private Long patientPhNo;
	private String date;
	private String symptoms;
	private String doctor;
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
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public Long getPatientPhNo() {
		return patientPhNo;
	}
	public void setPatientPhNo(Long patientPhNo) {
		this.patientPhNo = patientPhNo;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	public String getDoctor() {
		return doctor;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
	@Override
	public String toString() {
		return "Appointment [id=" + id + ", patientId=" + patientId + ", patientName=" + patientName + ", patientPhNo="
				+ patientPhNo + ", date=" + date + ", symptoms=" + symptoms + ", doctor=" + doctor + "]";
	}
	

}
