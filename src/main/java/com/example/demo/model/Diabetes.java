package com.example.demo.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Diabetes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	 private Long id;
	    private String patientId;
	    private LocalDate date;
	    private double risk;
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
		public LocalDate getDate() {
			return date;
		}
		public void setDate(LocalDate date) {
			this.date = date;
		}
		public double getRisk() {
			return risk;
		}
		public void setRisk(double risk) {
			this.risk = risk;
		}
		@Override
		public String toString() {
			return "Diabetes [id=" + id + ", patientId=" + patientId + ", date=" + date + ", risk=" + risk + "]";
		}
		
		
	    
}
