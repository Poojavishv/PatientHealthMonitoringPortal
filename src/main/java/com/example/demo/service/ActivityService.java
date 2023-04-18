package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Activity;
import com.example.demo.repo.ActivityRepository;

import jakarta.transaction.Transactional;

@Service
public class ActivityService {
	@Autowired
	private ActivityRepository activityRepository;
	
	@Transactional
    public void saveActivityDetails(Activity activity) {
		activityRepository.save(activity);
 }
	
	public ArrayList<Activity> getActivityList()
		{
			ArrayList<Activity> activityList = new ArrayList<>();
			activityList.addAll(activityRepository.findAll());
			return activityList;
		}
	 public Activity getById(Long id)
	 {
		 Activity activityDetails = activityRepository.findById(id).orElse(new Activity());
		 return activityDetails;
	 }
	public ArrayList<Activity> findBypatientId(String patientId) {
		ArrayList<Activity> activityDetails1 = activityRepository.findBypatientId(patientId);
		 return activityDetails1;
	}
	

}
