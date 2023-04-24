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
	private String docSq1;
	private String docSq2;
	private String docSq3;
	private String docSa1;
	private String docSa2;
	private String docSa3;
	
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
	
	public String getDocSq1() {
		return docSq1;
	}
	
	public void setDocSq1(String docSq1) {
		this.docSq1 = docSq1;
	}
	public String getDocSq2() {
		return docSq2;
	}
	public void setDocSq2(String docSq2) {
		this.docSq2 = docSq2;
	}
	public String getDocSq3() {
		return docSq3;
	}
	public void setDocSq3(String docSq3) {
		this.docSq3 = docSq3;
	}
	public String getDocSa1() {
		return docSa1;
	}
	public void setDocSa1(String docSa1) {
		this.docSa1 = docSa1;
	}
	public String getDocSa2() {
		return docSa2;
	}
	public void setDocSa2(String docSa2) {
		this.docSa2 = docSa2;
	}
	public String getDocSa3() {
		return docSa3;
	}
	public void setDocSa3(String docSa3) {
		this.docSa3 = docSa3;
	}
	
	
	
	
	
	

}