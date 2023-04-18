package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table
public class CholestrolMonitor {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cholestrolMonitorId;
    
//    @Column(insertable=false, updatable=false)
    private String patientId;
    

    private String timeOfDayCholestrolMonitor;
    
    
    private Double cholestrolLevel;


	public Long getCholestrolMonitorId() {
		return cholestrolMonitorId;
	}


	public void setCholestrolMonitorId(Long cholestrolMonitorId) {
		this.cholestrolMonitorId = cholestrolMonitorId;
	}


	public String getPatientId() {
		return patientId;
	}


	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}


	


	public String getTimeOfDayCholestrolMonitor() {
		return timeOfDayCholestrolMonitor;
	}


	public void setTimeOfDayCholestrolMonitor(String timeOfDayCholestrolMonitor) {
		this.timeOfDayCholestrolMonitor = timeOfDayCholestrolMonitor;
	}


	public Double getCholestrolLevel() {
		return cholestrolLevel;
	}


	public void setCholestrolLevel(Double cholestrolLevel) {
		this.cholestrolLevel = cholestrolLevel;
	}


	@Override
	public String toString() {
		return "CholestrolMonitor [id=" + cholestrolMonitorId + ", patientId=" + patientId + ", timeOfDay=" + timeOfDayCholestrolMonitor
				+ ", cholestrolLevel=" + cholestrolLevel + "]";
	}


	


	
    
   
}

