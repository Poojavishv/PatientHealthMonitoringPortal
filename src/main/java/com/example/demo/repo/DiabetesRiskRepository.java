package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.DiabetesRisk;


public interface DiabetesRiskRepository extends JpaRepository<DiabetesRisk, Long> {
}