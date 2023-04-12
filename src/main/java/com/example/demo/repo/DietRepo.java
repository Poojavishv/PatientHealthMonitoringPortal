package com.example.demo.repo;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Diet;

public interface DietRepo extends JpaRepository<Diet,Long> {


	public ArrayList<Diet> findBypatientId(String patientId);

}
