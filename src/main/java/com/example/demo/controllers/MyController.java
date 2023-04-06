package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.example.demo.model.Doctor;
import com.example.demo.model.Patient;
import com.example.demo.service.DoctorService;
import com.example.demo.service.PatientService;

import com.example.demo.service.AdminService;

@Controller
public class MyController {

	@Autowired
	DoctorService docService;
	@Autowired
	PatientService patientService;


	@Autowired
	AdminService adService;


	@RequestMapping("/")
	public ModelAndView indexView() {
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}

	@RequestMapping("/about")
	public ModelAndView aboutView() {
		ModelAndView mv = new ModelAndView("about");
		return mv;
	}

	@RequestMapping("/contact")
	public ModelAndView contactView() {
		ModelAndView mv = new ModelAndView("contact");
		return mv;
	}

	@RequestMapping("/userlogin")
	public ModelAndView userloginView() {
		ModelAndView mv = new ModelAndView("userlogin");
		return mv;
	}

	@RequestMapping("/loginCheckDoctor")
	public ModelAndView doctorLoginCheck(String docEmail, String docPassword) {
		ModelAndView mv = new ModelAndView();
		if (docService.doctorLoginCheck(docEmail, docPassword)) {
			mv.setViewName("index");
			return mv;
		} else {
			mv.setViewName("doctorlogin");
			mv.addObject("smsg", "");
			mv.addObject("emsg", "Invalid Username or Password");
			return mv;
		}

	}

	@RequestMapping("/loginCheckPatient")
	public ModelAndView patientLoginCheck(String patientEmail, String patientPassword) {
		ModelAndView mv = new ModelAndView();
		if (patientService.patientLoginCheck(patientEmail, patientPassword)) {
			mv.setViewName("index");
			return mv;
		} else {
			mv.setViewName("userlogin");
			mv.addObject("smsg", "");
			mv.addObject("emsg", "Invalid Username or Password");
			return mv;
		}
	}
		
	@RequestMapping("/hospitaladminlogin")
	public ModelAndView hospitalloginView() {
		ModelAndView mv = new ModelAndView("hospitaladminlogin");
		mv.addObject("smsg", "");
		mv.addObject("emsg", "");
		mv.addObject("name", mv);
		return mv;
	}


	@RequestMapping("/doctorReg")
	public ModelAndView doctorRegistration(Doctor doc) {
		docService.addDoctorDetails(doc);
		ModelAndView mv = new ModelAndView("doctorlogin");
		mv.addObject("smsg", "Registration Was Succesfull Login Now");
		mv.addObject("emsg", "");
		return mv;
	}

	@RequestMapping("/userreg")
	public ModelAndView userRegView() {
		ModelAndView mv = new ModelAndView("userreg");
		return mv;
	}

	@RequestMapping("/patientReg")
	public ModelAndView patientRegView(Patient patient) {
		patientService.addPatientDetails(patient);
		ModelAndView mv = new ModelAndView("userlogin");
		mv.addObject("smsg", "Registration Was Succesfull Login Now");
		mv.addObject("emsg", "");
		return mv;
	}

	@RequestMapping("/hospitalAdminRegister")
	public ModelAndView hospitalAdminRegisterView() {
		ModelAndView mv = new ModelAndView("hospitalAdminRegister");
		return mv;
	}


	@RequestMapping("/loginCheck")
	public ModelAndView loginCheckView(String userid, String password) {
		ModelAndView mv = new ModelAndView();
		if (adService.adminLoginCheck(userid, password)) {

			mv.setViewName("adminHome");

			return mv;
		}

		else {
			mv.setViewName("hospitaladminlogin");
			mv.addObject("smsg", "");
			mv.addObject("emsg", "Invalid userid or password");
			return mv;
		}

	}

	@RequestMapping("/doctorlogin")
	public ModelAndView doctorloginView1() {
		ModelAndView mv = new ModelAndView("doctorlogin");
		return mv;
	}

	@RequestMapping("/doctorlogin")
	public ModelAndView doctorloginView() {
		ModelAndView mv = new ModelAndView("doctorlogin");
		mv.addObject("smsg", "");
		mv.addObject("emsg", "");
		return mv;

	}

	@RequestMapping("/doctorregistration")
	public ModelAndView doctorregView() {
		ModelAndView mv = new ModelAndView("doctorregistration");
		return mv;
	}


	@RequestMapping("/forgotPassword1")
	public ModelAndView forgotPassword1View() {
		ModelAndView mv = new ModelAndView("forgotPassword1");
		return mv;
	}

}
