package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "admindb", schema = "trainingbykarthiksir")
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String userid;
	@Column(name="name", nullable = false, length=20,unique = true)
	private String name;
	@Column(nullable = false, length=64)
	private String password;
	
	@Override
	public String toString() {
		return "Admin [userid=" + userid + ", name=" + name + ", password=" + password + "]";
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
