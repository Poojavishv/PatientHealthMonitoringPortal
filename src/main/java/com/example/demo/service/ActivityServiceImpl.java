package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Activity;
import com.example.demo.repo.ActivityRepository;

@Service
public class ActivityServiceImpl implements ActivityService {
    
    @Autowired
    private ActivityRepository activityRepository;
    
    @Override
    public void saveActivity(Activity activity) {
        activityRepository.save(activity);
    }
}
