package com.example.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Activity;
import com.example.demo.model.Appointment;
import com.example.demo.model.BMI;
import com.example.demo.model.BloodCount;
import com.example.demo.model.CalorieIntake;
import com.example.demo.model.CholestrolMonitor;
import com.example.demo.model.DiabetesRisk;
import com.example.demo.model.Diet;
import com.example.demo.model.Doctor;
import com.example.demo.model.Patient;
import com.example.demo.model.Pressure;
import com.example.demo.model.Thyroid;
import com.example.demo.repo.ActivityRepository;
import com.example.demo.repo.PressureRepository;
import com.example.demo.service.DoctorService;
import com.example.demo.service.PatientService;
import com.example.demo.service.ThyroidService;

import jakarta.servlet.http.HttpServletRequest;

import com.example.demo.service.ActivityService;

import com.example.demo.service.AdminService;
import com.example.demo.service.AppointmentService;
import com.example.demo.service.BMIService;
import com.example.demo.service.BloodCountService;
import com.example.demo.service.CalorieIntakeService;
import com.example.demo.service.CholestrolService;
import com.example.demo.service.DiabetesRiskService;
import com.example.demo.service.DietService;
import com.example.demo.service.DoctorService;
import com.example.demo.service.PatientService;
import com.example.demo.service.ThyroidService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {

	@Autowired
	DoctorService docService;
	@Autowired
	PatientService patientService;


	@Autowired
	AdminService adService;
	ActivityService activityService;
	@Autowired
	BMIService bmiService;
	DiabetesRiskService diabService;
	@Autowired
    private BloodCountService bloodCountService;
	@Autowired
    private CalorieIntakeService calorieIntakeService;
	@Autowired	
	ThyroidService thyroidService;
	@Autowired	
	CholestrolService cholestrolService;
	@Autowired	
	DietService dietService;
	@Autowired	
	AppointmentService appointmentService;
	
	
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
	
	 @RequestMapping("/appointment")
		public ModelAndView apprloginView(HttpServletRequest req) {
			ArrayList<Doctor> doctorList = docService.getDoctorList();
			System.out.println(doctorList);
			req.setAttribute("doctorList", doctorList);
			ModelAndView mv = new ModelAndView("appointment");
			mv.addObject("successMessage", "");
			return mv;
		}

	 @RequestMapping("/saveappointment")
	 public ModelAndView saveappointment(Appointment appointment) {
		 ModelAndView modelAndView = new ModelAndView("appointment");
		 appointmentService.saveAppointment(appointment);
	       
	        modelAndView.addObject("successMessage", "Appointment details  recorded successfully.");
	        modelAndView.addObject("patientId",appointment.getPatientId());
			return modelAndView;
			
	        
	    }
	 @RequestMapping("/viewappointment")
		public ModelAndView appviewloginView(HttpServletRequest req) {
			ArrayList<Appointment> appointmentList = appointmentService.getAppointmentList();
			System.out.println(appointmentList);
			req.setAttribute("appointmentList", appointmentList);
			ModelAndView mv = new ModelAndView("updateAppoint");
			mv.addObject("successMessage", "");
			return mv;
		}
	 
	 @RequestMapping("/UpdateAppointment")
	    
	 public ModelAndView showUpdateForm(Long appointmentId) {
		 Appointment appointmentDetails = appointmentService.getById(appointmentId);
		 ModelAndView mv=new ModelAndView("updatePrescription");
		 mv.addObject("appointmentDetails",appointmentDetails);
	        return mv;
	    }
	 

	    @RequestMapping("/Saveprescription")
	    public ModelAndView Saveprescription(Appointment appointment) {
	        
	        
	        ModelAndView mav = new ModelAndView("updatePrescription");
	        appointmentService.saveAppointment(appointment);
	        mav.addObject("successMessage", "Updated prescription successfully.");
	        mav.addObject("appointmentId",appointment.getAppointmentId());
	        
	        return mav;
	    }
	    @RequestMapping("/viewPrescription")
		public ModelAndView appPrescriptionView(HttpServletRequest req,String patientEmail) {
	    	System.out.println(patientEmail);
	    	ArrayList<Appointment> appointmentList = appointmentService.getAppointmentList();
			System.out.println(appointmentList);
			req.setAttribute("appointmentList", appointmentList);
			 
			ArrayList<Appointment> appointmentDetails = appointmentService.findBypatientId(patientEmail);
			req.setAttribute("appointmentDetails", appointmentDetails);
			ModelAndView mv = new ModelAndView("prescription");
	        mv.addObject("patientId",patientEmail);
	        System.out.println(appointmentDetails);

			mv.addObject("appointmentDetails1",appointmentDetails);
			mv.addObject("successMessage", "");
	        
	        return mv;
	    }
	

	@RequestMapping("/loginCheckDoctor")
	public ModelAndView doctorLoginCheck(String docEmail, String docPassword) {
		ModelAndView mv = new ModelAndView();
		if (docService.doctorLoginCheck(docEmail, docPassword)) {
			mv.setViewName("doctorHome");
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
			mv.addObject("patientId",patientEmail);
			mv.setViewName("patientHome");
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
	 @RequestMapping(value = "/BMI")
	    
	 public ModelAndView showLoginForm(String patientEmail) {
		 ModelAndView mv=new ModelAndView("BMI");
		 mv.addObject("patientId",patientEmail);
	        return mv;
	    }
	 

	    @RequestMapping(value = "/calculateBMI")
	    public ModelAndView calculateBMI(@RequestParam("height") double height, @RequestParam("weight") double weight,BMI bmi1) {
	        double bmi = bmiService.calculateBMI(height, weight);
	        
	        ModelAndView mav = new ModelAndView("bmiResult");
	        mav.addObject("bmi", bmi);
	        mav.addObject("successMessage", "Generated BMI levels successfully.");
	        mav.addObject("patientId",bmi1.getPatientId());
	        return mav;
	    }
	    @RequestMapping(value = "/calculateBMIsave")
	    public ModelAndView saveBMI(BMI bmi1) {
	               
	        ModelAndView mav = new ModelAndView("bmiResult");
	        bmiService.addBMIDetails(bmi1);
		       
	        mav.addObject("successMessage", "BMI recorded successfully.");
	        mav.addObject("patientId",bmi1.getPatientId());
	        return mav;
	    }
	    @RequestMapping("/Glucose")
		public ModelAndView glucoseView(String patientEmail) {
			ModelAndView mv = new ModelAndView("glucoseResult");
			mv.addObject("patientId",patientEmail);
			mv.addObject("successMessage", "");
			return mv;
		}
	   	
	    @RequestMapping("/calculateGlucosesave")
	    public ModelAndView saveGlucose(BMI bmi1) {
		 ModelAndView modelAndView = new ModelAndView("glucoseResult");
		 bmiService.addBMIDetails(bmi1);
	       
	        modelAndView.addObject("successMessage", "Glucose levels recorded successfully.");
	        modelAndView.addObject("patientId",bmi1.getPatientId());
	        return modelAndView;
	    }
	    
	    @Autowired
	    private DiabetesRiskService diabetesRiskService;
	    
	    @RequestMapping(value = "/calculateDiabetesRisk")
	    public ModelAndView calculateDiabetesRisk(String patientEmail) {
	    	BloodCount bloodCount =  bloodCountService.getByPatientId(patientEmail);
//	    	System.out.println(bloodCount);
//	    	double diabetesRisk1 = diabetesRiskService.calculateRisk(bloodCount);
	        ModelAndView modelAndView = new ModelAndView();
	        modelAndView.setViewName("diabetesRiskForm");
//	        modelAndView.addObject("diabetesRisk1", diabetesRisk1);
//	        System.out.println(diabetesRisk1);
	        modelAndView.addObject("diabetesRisk", new DiabetesRisk(patientEmail, bloodCount));
	        return modelAndView;
	        
	        
	    }
	    @RequestMapping("/generateDiabetesRisk")
	    public ModelAndView generateDiabetesRisk(String pid)
	    {
	    	BloodCount bloodCount =  bloodCountService.getByPatientId(pid);
	    	System.out.println(bloodCount);
	    	double diabetesRisk1 = diabetesRiskService.calculateRisk(bloodCount);
	    	ModelAndView modelAndView = new ModelAndView("diabetesResult");
	    	 modelAndView.addObject("diabetesRisk1", diabetesRisk1);
	    	 return modelAndView;
	    }
	    
	 

	 @RequestMapping("/BloodCount")
	    public ModelAndView showAddBloodCountForm(String patientEmail) {
	        ModelAndView modelAndView = new ModelAndView("BloodCount");
	        
	        modelAndView.addObject("patientId",patientEmail);
	        modelAndView.addObject("successMessage", "");
	        return modelAndView;
	    }
	    
	 @RequestMapping("/BloodCountsave")
	    public ModelAndView addBloodCount(BloodCount bloodCount) {
		 ModelAndView modelAndView = new ModelAndView("BloodCount");
	        bloodCountService.saveBloodCount(bloodCount);
	       
	        modelAndView.addObject("successMessage", "Blood Count details recorded successfully.");
	        modelAndView.addObject("patientId",bloodCount.getPatientId());
	        return modelAndView;
	    }

	 @RequestMapping("/DiabetesCal")
	    
	 public ModelAndView showDiabetesForm(String patientEmail) {
		 ModelAndView mv=new ModelAndView("diabetesCal");
		 mv.addObject("patientId",patientEmail);
		 
	        return mv;
	    }
	
	 
	 @RequestMapping("/CalorieAdd")
	 public ModelAndView showAddCalorieIntakeForm(String patientEmail) {
		 ModelAndView modelAndView = new ModelAndView("CalorieAdd");
	      
	        modelAndView.addObject("patientId",patientEmail);
	        modelAndView.addObject("successMessage", "");
	        return modelAndView;
	       
	    }

	 @RequestMapping("/calorieIntakeResult")
	 public ModelAndView saveCalorieIntake( CalorieIntake calorieIntake) {
		 ModelAndView modelAndView = new ModelAndView("CalorieAdd");
	        calorieIntakeService.saveCalorieCount(calorieIntake);
	        
	        modelAndView.addObject("successMessage", "Calorie details details recorded successfully.");
	        modelAndView.addObject("patientId",calorieIntake.getPatientId());
			return modelAndView;
			
	        
	    }
	 @RequestMapping("/Thyroid")
	 public ModelAndView showAddThyroid(String patientEmail) {
		 ModelAndView modelAndView = new ModelAndView("Thyroid");
	        
	        modelAndView.addObject("patientId",patientEmail);
	        modelAndView.addObject("successMessage", "");
	        return modelAndView;
	       
	    }

	 @RequestMapping("/ThyroidResult")
	 public ModelAndView saveThyroid( Thyroid thyroid) {
		 ModelAndView modelAndView = new ModelAndView("Thyroid");
	        thyroidService.saveThyroidDetails(thyroid);
	       
	        modelAndView.addObject("successMessage", "Thyroid details  recorded successfully.");
	        modelAndView.addObject("patientId",thyroid.getPatientId());
			return modelAndView;
			
	        
	    }
	 @RequestMapping("/cholestrol")
	 public ModelAndView showAddcholestrol(String patientEmail) {
		 ModelAndView modelAndView = new ModelAndView("cholestrol");
	      
	        modelAndView.addObject("patientId",patientEmail);
	        modelAndView.addObject("successMessage", "");
	        return modelAndView;
	       
	    }

	 @RequestMapping("/cholestrolResult")
	 public ModelAndView saveCholestrolResult(CholestrolMonitor cholestrolMonitor) {
		 ModelAndView modelAndView = new ModelAndView("cholestrol");
	        cholestrolService.saveDetails(cholestrolMonitor);
	        
	        modelAndView.addObject("successMessage", "Cholestrol details  recorded successfully.");
	        modelAndView.addObject("patientId",cholestrolMonitor.getPatientId());
			return modelAndView;
			
	        
	    }
	 
	 @RequestMapping("/diet")
	 public ModelAndView showAddDiet(String patientEmail) {
		 ModelAndView modelAndView = new ModelAndView("dietResult");
	        modelAndView.addObject("patientId",patientEmail);
	        modelAndView.addObject("successMessage", "");
	        return modelAndView;
	       
	    }

	 @RequestMapping("/dietResult1")
	 public ModelAndView saveDietResult(Diet diet) {
		 ModelAndView modelAndView = new ModelAndView("dietResult");
		 System.out.println("test");
		 System.out.println(diet);
	        dietService.saveDietDetails(diet);
	       
	        modelAndView.addObject("successMessage", "Diet details  recorded successfully.");
	        modelAndView.addObject("patientId",diet.getPatientId());
			return modelAndView;
	        
	    }
	 @RequestMapping("/viewDiet")
		public ModelAndView appviewDietView(HttpServletRequest req) {
			ArrayList<Diet> dietList = dietService.getDietList();
			System.out.println(dietList);
			req.setAttribute("dietList", dietList);
			ModelAndView mv = new ModelAndView("updateDiet");
			mv.addObject("successMessage", "");
			return mv;
		}
	 @RequestMapping("/UpdateDiet")
	    
	 public ModelAndView showUpdateDietForm(Long id) {
		 Diet DietDetails = dietService.getById(id);
		 ModelAndView mv=new ModelAndView("updateDietDetails");
		 mv.addObject("DietDetails",DietDetails);
	        return mv;
	    }
	 @RequestMapping("/SaveUpdateDiet")
	    public ModelAndView SaveupdateDiet(Diet diet) {
	        
	        
	        ModelAndView mav = new ModelAndView("updateDietDetails");
	        dietService.saveDietDetails(diet);
	        mav.addObject("successMessage", "Updated prescription successfully.");
	        mav.addObject("id",diet.getId());
	        
	        return mav;
	    }
	 @RequestMapping("/viewpatientUpdateDiet")
		public ModelAndView patientUpdateDietView(HttpServletRequest req,String patientEmail) {
	    	System.out.println(patientEmail);
	    	ArrayList<Diet> dietList = dietService.getDietList();
			System.out.println(dietList);
			req.setAttribute("appointmentList", dietList);
			 
			ArrayList<Diet> DietDetails = dietService.findBypatientId(patientEmail);
			req.setAttribute("DietDetails", DietDetails);
			ModelAndView mv = new ModelAndView("viewUpdateDiet");
	        mv.addObject("patientId",patientEmail);
	        System.out.println(DietDetails);

			mv.addObject("dietDetails1",DietDetails);
			mv.addObject("successMessage", "");
	        
	        return mv;
	    }
	 
	 

		@GetMapping("/activities")
		public ModelAndView activities(String patientEmail) {
			ModelAndView modelAndView = new ModelAndView("activities");
			 modelAndView.addObject("patientId",patientEmail);
		        modelAndView.addObject("successMessage", "");
		        return modelAndView;
		}

		@PostMapping("/saveActivity")
		public ModelAndView saveActivity(Activity activity) {
			ModelAndView modelAndView = new ModelAndView("activities");
			activityService.saveActivityDetails(activity);
			
			modelAndView.addObject("successMessage", "Activity details recorded successfully");
			 modelAndView.addObject("patientId",activity.getPatientId());
			return modelAndView;
		}
		
		 @RequestMapping("/viewActivity")
			public ModelAndView appviewActivityView(HttpServletRequest req) {
				ArrayList<Activity> activityList = activityService.getActivityList();
				System.out.println(activityList);
				req.setAttribute("activityList", activityList);
				ModelAndView mv = new ModelAndView("updateActivity");
				mv.addObject("successMessage", "");
				return mv;
			}
		 @RequestMapping("/UpdateActivity")
		    
		 public ModelAndView showUpdateActivityForm(Long id) {
			 Activity activityDetails = activityService.getById(id);
			 ModelAndView mv=new ModelAndView("updateDietDetails");
			 mv.addObject("activityDetails",activityDetails);
		        return mv;
		    }
		@Autowired
	    private PressureRepository pressureRepository;

	    @GetMapping("/pressure")
	    public ModelAndView pressure( String patientEmail) {
	        ModelAndView modelAndView = new ModelAndView("pressure");
	       
	        modelAndView.addObject("patientId", patientEmail);
	        modelAndView.addObject("successMessage", "");
	        return modelAndView;
	    }

	    @PostMapping("/savePressure")
	    public ModelAndView savePressure(Pressure pressure) {
	    	ModelAndView modelAndView = new ModelAndView("pressure");
	        pressureRepository.save(pressure);
	        
	        modelAndView.addObject("successMessage", "Pressure reading recorded successfully");
	        modelAndView.addObject("patientId",pressure.getPatientId());
	        return modelAndView;
	    }


}
