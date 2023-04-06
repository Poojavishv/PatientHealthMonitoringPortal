package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Admin;
import com.example.demo.repo.AdminRepo;


@Service
public class AdminService {
	@Autowired
 AdminRepo repo;


	public boolean adminLoginCheck(String userid,String password) {
		Admin ad=repo.findByUserid(userid);
		if(ad==null) {
			return false;
		}
		else if(ad.getPassword().equals(password)) {
			return true;
		}
		else {
			return false;
		}
	}
}
