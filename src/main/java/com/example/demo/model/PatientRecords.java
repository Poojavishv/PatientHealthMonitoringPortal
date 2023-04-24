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
	
	private String patientId;
    private String patientName;
    private String docId;
    private String docName;
    private String updatePatientRec;
    
    @Override
	public String toString() {
		return "PatientRecords [patientRecId=" + patientRecId + ", patientId=" + patientId + ", patientName="
				+ patientName + ", docId=" + docId + ", docName=" + docName + ", updatePatientRec=" + updatePatientRec
				+ "]";
	}
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
public String getPatientName() {
	return patientName;
}
public void setPatientName(String patientName) {
	this.patientName = patientName;
}
public String getDocId() {
	return docId;
}
public void setDocId(String docId) {
	this.docId = docId;
}
public String getDocName() {
	return docName;
}
public void setDocName(String docName) {
	this.docName = docName;
}
public String getUpdatePatientRec() {
	return updatePatientRec;
}
public void setUpdatePatientRec(String updatePatientRec) {
	this.updatePatientRec = updatePatientRec;
}
	
    


	
	
	
}
