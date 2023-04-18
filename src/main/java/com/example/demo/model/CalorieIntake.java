package com.example.demo.model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CalorieIntake {

	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long calorieIntakeId;
//	    @Column(insertable=false, updatable=false)
	    private String patientId;
	    private LocalDate dateCalorieIntake;
	    private Integer calories;
	    private LocalTime timeOfIntake;
		
		public Long getCalorieIntakeId() {
			return calorieIntakeId;
		}
		public void setCalorieIntakeId(Long calorieIntakeId) {
			this.calorieIntakeId = calorieIntakeId;
		}
		public String getPatientId() {
			return patientId;
		}
		public void setPatientId(String patientId) {
			this.patientId = patientId;
		}
		
		public LocalDate getDateCalorieIntake() {
			return dateCalorieIntake;
		}
		public void setDateCalorieIntake(LocalDate dateCalorieIntake) {
			this.dateCalorieIntake = dateCalorieIntake;
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
			return "CalorieIntake [id=" + calorieIntakeId + ", patientId=" + patientId + ", date=" + dateCalorieIntake + ", calories=" + calories
					+ ", timeOfIntake=" + timeOfIntake + "]";
		}
		

	    
	}
