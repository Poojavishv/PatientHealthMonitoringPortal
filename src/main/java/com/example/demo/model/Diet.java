package com.example.demo.model;


import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table
public class Diet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    private String patientId;
    private String doctor;
    
    private String dietdate;


    private String dietFood;

    
    private LocalTime timeOfIntake;
    
    private String updateDiet1;


	public String getUpdateDiet1() {
		return updateDiet1;
	}


	public void setUpdateDiet1(String updateDiet1) {
		this.updateDiet1 = updateDiet1;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

	public String getDietdate() {
		return dietdate;
	}


	public void setDietdate(String dietdate) {
		this.dietdate = dietdate;
	}


	public String getPatientId() {
		return patientId;
	}


	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	


	public String getDietFood() {
		return dietFood;
	}


	public void setDietFood(String dietFood) {
		this.dietFood = dietFood;
	}


	public LocalTime getTimeOfIntake() {
		return timeOfIntake;
	}


	public void setTimeOfIntake(LocalTime timeOfIntake) {
		this.timeOfIntake = timeOfIntake;
	}


	public String getDoctor() {
		return doctor;
	}


	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}


	@Override
	public String toString() {
		return "Diet [id=" + id + ", patientId=" + patientId + ", doctor=" + doctor + ", dietdate=" + dietdate
				+ ", dietFood=" + dietFood + ", timeOfIntake=" + timeOfIntake + ", updateDiet1=" + updateDiet1 + "]";
	}


	
	


	
	

}

