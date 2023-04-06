package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity 
public class Patient {
	
	@Id
	@GeneratedValue
	private Long patientId;
	private String patientFname;
	private String patientLname;
	
	@Column(unique=true)
	private String patientEmail;
	@Column(unique=true)
	private Long patientPhNo;
	private String patientGender;
	private String patientPassword;
	private Integer patientAge;
	private String patientUserId;
	private String patientCity;
	
	public String getPatientFname() {
		return patientFname;
	}
	public void setPatientFname(String patientFname) {
		this.patientFname = patientFname;
	}
	public String getPatientLname() {
		return patientLname;
	}
	public void setPatientLname(String patientLname) {
		this.patientLname = patientLname;
	}
	public String getPatientEmail() {
		return patientEmail;
	}
	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}
	public Long getPatientPhNo() {
		return patientPhNo;
	}
	public void setPatientPhNo(Long patientPhNo) {
		this.patientPhNo = patientPhNo;
	}
	public String getPatientGender() {
		return patientGender;
	}
	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}
	public String getPatientPassword() {
		return patientPassword;
	}
	public void setPatientPassword(String patientPassword) {
		this.patientPassword = patientPassword;
	}
	public Integer getPatientAge() {
		return patientAge;
	}
	public void setPatientAge(Integer patientAge) {
		this.patientAge = patientAge;
	}
	public String getPatientUserId() {
		return patientUserId;
	}
	public void setPatientUserId(String patientUserId) {
		this.patientUserId = patientUserId;
	}
	public String getPatientCity() {
		return patientCity;
	}
	public void setPatientCity(String patientCity) {
		this.patientCity = patientCity;
	}
	
	
	
	
	
	
	

}
