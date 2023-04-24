package com.example.demo.repo;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Doctor;

import jakarta.transaction.Transactional;

@EnableJpaRepositories("com.example.demo.repo")
@ComponentScan(basePackages = {"com.example.demo"})
@EntityScan("com.example.demo.model")
public interface DoctorRepo extends JpaRepository<Doctor, Long> {
	
	public Doctor findBydocEmail(String docEmail);
	
//	@Transactional
//	@Modifying
//	@Query("UPDATE doctor SET doctor.docPassword=:docPassword WHERE doctor.docEmail=:docEmail")
//	public void updatedocPassword(@Param("docEmail")String docEmail,@Param("docPassword")String docPassword);
	
	
}