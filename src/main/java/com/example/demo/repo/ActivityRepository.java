package com.example.demo.repo;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Activity;


public interface ActivityRepository extends JpaRepository<Activity, Long> {



	public ArrayList<Activity> findBypatientId(String patientId);

}