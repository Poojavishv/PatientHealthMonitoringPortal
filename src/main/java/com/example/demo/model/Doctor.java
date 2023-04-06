package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Doctor {
	
	@Id
	@GeneratedValue
	private Long docId;
	private String docFname;
	private String docLname;
	@Column(unique=true)
	private String docEmail;
	@Column(unique=true)
	private Long docPhNo;
	private String docGender;
	private String docPassword;
	private Integer docAge;
	private String docUserId;
	
	public Long getDocId() {
		return docId;
	}
	public void setDocId(Long docId) {
		this.docId = docId;
	}
	public String getDocFname() {
		return docFname;
	}
	public void setDocFname(String docFname) {
		this.docFname = docFname;
	}
	public String getDocLname() {
		return docLname;
	}
	public void setDocLname(String docLname) {
		this.docLname = docLname;
	}
	public String getDocEmail() {
		return docEmail;
	}
	public void setDocEmail(String docEmail) {
		this.docEmail = docEmail;
	}
	public Long getDocPhNo() {
		return docPhNo;
	}
	public void setDocPhNo(Long docPhNo) {
		this.docPhNo = docPhNo;
	}
	public String getDocGender() {
		return docGender;
	}
	public void setDocGender(String docGender) {
		this.docGender = docGender;
	}
	public String getDocPassword() {
		return docPassword;
	}
	public void setDocPassword(String docPassword) {
		this.docPassword = docPassword;
	}
	public Integer getDocAge() {
		return docAge;
	}
	public void setDocAge(Integer docAge) {
		this.docAge = docAge;
	}
	public String getDocUserId() {
		return docUserId;
	}
	public void setDocUserId(String docUserId) {
		this.docUserId = docUserId;
	}
	
	
	
	
	
	

}
