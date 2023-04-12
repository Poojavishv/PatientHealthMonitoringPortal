package com.example.demo.model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CalorieIntake {

	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	    private String patientId;
	    private LocalDate date;
	    private Integer calories;
	    private LocalTime timeOfIntake;
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
		public Integer getCalories() {
			return calories;
		}
		public void setCalories(Integer calories) {
			this.calories = calories;
		}
		public LocalTime getTimeOfIntake() {
			return timeOfIntake;
		}
		public void setTimeOfIntake(LocalTime timeOfIntake) {
			this.timeOfIntake = timeOfIntake;
		}
		@Override
		public String toString() {
			return "CalorieIntake [id=" + id + ", patientId=" + patientId + ", date=" + date + ", calories=" + calories
					+ ", timeOfIntake=" + timeOfIntake + "]";
		}
		

	    
	}
