package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.CalorieIntake;

public interface CalorieRepo extends JpaRepository<CalorieIntake, Long> {

}
