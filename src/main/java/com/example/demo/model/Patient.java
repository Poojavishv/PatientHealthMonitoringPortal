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
	private String paSq1;
	private String paSq2;
	private String paSq3;
	private String paSa1;
	private String paSa2;
	private String paSa3;
	
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
	public Long getPatientId() {
		return patientId;
	}
	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}
	public String getPaSq1() {
		return paSq1;
	}
	public void setPaSq1(String paSq1) {
		this.paSq1 = paSq1;
	}
	public String getPaSq2() {
		return paSq2;
	}
	public void setPaSq2(String paSq2) {
		this.paSq2 = paSq2;
	}
	public String getPaSq3() {
		return paSq3;
	}
	public void setPaSq3(String paSq3) {
		this.paSq3 = paSq3;
	}
	public String getPaSa1() {
		return paSa1;
	}
	public void setPaSa1(String paSa1) {
		this.paSa1 = paSa1;
	}
	public String getPaSa2() {
		return paSa2;
	}
	public void setPaSa2(String paSa2) {
		this.paSa2 = paSa2;
	}
	public String getPaSa3() {
		return paSa3;
	}
	public void setPaSa3(String paSa3) {
		this.paSa3 = paSa3;
	}
	
	
	
	
	
	
	

}
