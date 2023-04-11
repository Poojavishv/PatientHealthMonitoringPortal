package com.example.demo.model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String patientId;

    private LocalDate date;

    private String activity1;

    private LocalTime timeOfWorkout;

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

	

	public String getActivity1() {
		return activity1;
	}

	public void setActivity1(String activity1) {
		this.activity1 = activity1;
	}

	public LocalTime getTimeOfWorkout() {
		return timeOfWorkout;
	}

	public void setTimeOfWorkout(LocalTime timeOfWorkout) {
		this.timeOfWorkout = timeOfWorkout;
	}

	@Override
	public String toString() {
		return "Activity [id=" + id + ", patientId=" + patientId + ", date=" + date + ", activity1=" + activity1
				+ ", timeOfWorkout=" + timeOfWorkout + "]";
	}

	

   
}