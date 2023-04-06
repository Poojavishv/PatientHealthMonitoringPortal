package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.AdminService;

@Controller
public class MyController {
	@Autowired
	AdminService adService;
	@RequestMapping("/")
	public ModelAndView indexView() {
		ModelAndView mv=new ModelAndView("index");
		return mv;
	}
	@RequestMapping("/about")
	public ModelAndView aboutView() {
		ModelAndView mv=new ModelAndView("about");
		return mv;
	}
		@RequestMapping("/contact")
	public ModelAndView contactView() {
		ModelAndView mv=new ModelAndView("contact");
		return mv;
	}
		@RequestMapping("/userlogin")
		public ModelAndView userloginView() {
			ModelAndView mv=new ModelAndView("userlogin");
			return mv;
		}
		@RequestMapping("/hospitaladminlogin")
		public ModelAndView hospitalloginView() {
			ModelAndView mv=new ModelAndView("hospitaladminlogin");
			mv.addObject("smsg","");
			mv.addObject("emsg","");
			mv.addObject("name", mv);		
			return mv;
		}
	@RequestMapping("/loginCheck")
	public ModelAndView loginCheckView(String userid,String password) {
		ModelAndView mv=new ModelAndView();
		if(adService.adminLoginCheck(userid, password)) {
			
			mv.setViewName("adminHome");
			
			return mv;
		}
		
		else {
			mv.setViewName("hospitaladminlogin");
			mv.addObject("smsg","");
			mv.addObject("emsg","Invalid userid or password");
			return mv;
		}
		
	}
		@RequestMapping("/doctorlogin")
		public ModelAndView doctorloginView() {
			ModelAndView mv=new ModelAndView("doctorlogin");
			return mv;
		}
		@RequestMapping("/doctorregistration")
		public ModelAndView doctorregView() {
			ModelAndView mv=new ModelAndView("doctorregistration");
			return mv;
		}
		@RequestMapping("/userreg")
		public ModelAndView userRegView() {
			ModelAndView mv=new ModelAndView("userreg");
			return mv;
		}
		
		@RequestMapping("/hospitalAdminRegister")
		public ModelAndView hospitalAdminRegisterView() {
			ModelAndView mv=new ModelAndView("hospitalAdminRegister");
			return mv;
		}
		
		@RequestMapping("/forgotPassword1")
		public ModelAndView forgotPassword1View() {
			ModelAndView mv=new ModelAndView("forgotPassword1");
			return mv;
		}
}
