package com.example.demo.controllers;

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
import com.example.demo.model.BloodCount;
import com.example.demo.model.CalorieIntake;
import com.example.demo.model.DiabetesRisk;
import com.example.demo.model.Doctor;
import com.example.demo.model.Patient;
import com.example.demo.model.Pressure;
import com.example.demo.repo.ActivityRepository;
import com.example.demo.repo.PressureRepository;
import com.example.demo.service.DoctorService;
import com.example.demo.service.PatientService;

import com.example.demo.service.AdminService;
import com.example.demo.service.BMIService;
import com.example.demo.service.BloodCountService;
import com.example.demo.service.CalorieIntakeService;
import com.example.demo.service.DiabetesRiskService;

@Controller
public class MyController {

	@Autowired
	DoctorService docService;
	@Autowired
	PatientService patientService;

	@Autowired
	AdminService adService;
	@Autowired
	BMIService bmiService;
	@Autowired
	private BloodCountService bloodCountService;
	@Autowired
	private CalorieIntakeService calorieIntakeService;

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
		ModelAndView mv = new ModelAndView("BMI");
		mv.addObject("patientId", patientEmail);
		return mv;
	}

	@RequestMapping(value = "/calculateBMI")
	public ModelAndView calculateBMI(@RequestParam("height") double height, @RequestParam("weight") double weight,
			@RequestParam("patientEmail") String patientEmail) {
		double bmi = bmiService.calculateBMI(height, weight);

		ModelAndView mav = new ModelAndView("bmiResult");
		mav.addObject("bmi", bmi);
		mav.addObject("patientId", patientEmail);
		return mav;
	}

	@RequestMapping(value = "/calculateGlucose")
	public ModelAndView calculateGlucose(@RequestParam("height") double height, @RequestParam("weight") double weight,
			@RequestParam("patientEmail") String patientEmail) {

		double glucoseLevel = bmiService.calculateGlucose(height, weight);

		ModelAndView mav = new ModelAndView("glucoseResult");

		mav.addObject("glucoseLevel", glucoseLevel);
		mav.addObject("patientId", patientEmail);
		return mav;
	}

	@RequestMapping("/Glucose")
	public ModelAndView glucoseView(String patientEmail) {
		ModelAndView mv = new ModelAndView("Glucose");
		mv.addObject("patientId", patientEmail);
		return mv;
	}

	@RequestMapping("/BloodCount")
	public ModelAndView showAddBloodCountForm(String patientEmail) {
		ModelAndView modelAndView = new ModelAndView("BloodCount");
		modelAndView.addObject("bloodCount", new BloodCount());
		modelAndView.addObject("patientId", patientEmail);
		return modelAndView;
	}

	@RequestMapping("/BloodCountsave")
	public ModelAndView addBloodCount(@ModelAttribute("bloodCount") BloodCount bloodCount,
			@RequestParam("patientEmail") String patientEmail) {
		bloodCountService.saveBloodCount(bloodCount);
		ModelAndView modelAndView = new ModelAndView("bloodCountResult");
		modelAndView.addObject("bloodCount", new BloodCount());
		modelAndView.addObject("successMessage", "Blood Count details recorded successfully.");
		modelAndView.addObject("patientId", patientEmail);
		return modelAndView;
	}

	@RequestMapping("/CalorieAdd")
	public ModelAndView showAddCalorieIntakeForm(String patientEmail) {
		ModelAndView modelAndView = new ModelAndView("CalorieAdd");
		modelAndView.addObject("calorieIntake", new CalorieIntake());
		modelAndView.addObject("patientId", patientEmail);
		return modelAndView;

	}

	@RequestMapping("/calorieIntakeResult")
	public ModelAndView saveCalorieIntake(@ModelAttribute("calorieIntake") CalorieIntake calorieIntake,
			@RequestParam("patientEmail") String patientEmail) {
		calorieIntakeService.saveCalorieCount(calorieIntake);
		ModelAndView modelAndView = new ModelAndView("calorieIntakeResult");
		modelAndView.addObject("calorieIntake", new CalorieIntake());
		modelAndView.addObject("successMessage", "Calorie details details recorded successfully.");
		modelAndView.addObject("patientId", patientEmail);
		return modelAndView;

	}

	@Autowired
    private PressureRepository pressureRepository;

    @GetMapping("/pressure")
    public ModelAndView pressure(@RequestParam("patientEmail") String patientId) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("pressures", pressureRepository.findByPatientId(patientId));
        modelAndView.addObject("pressure", new Pressure());
        modelAndView.addObject("patientId", patientId);
        modelAndView.setViewName("pressure");
        return modelAndView;
    }

    @PostMapping("/savePressure")
    public ModelAndView savePressure(Pressure pressure) {
        pressureRepository.save(pressure);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message", "Pressure reading recorded successfully");
        modelAndView.setViewName("pressureResult");
        return modelAndView;
    }

	

	@Autowired
	private ActivityRepository activityRepository;

	@GetMapping("/activities")
	public ModelAndView activities(@RequestParam("patientEmail") String patientId) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("activities", activityRepository.findByPatientId(patientId));
		modelAndView.addObject("activity", new Activity());
		modelAndView.addObject("patientId", patientId);
		modelAndView.setViewName("activities");
		return modelAndView;
	}

	@PostMapping("/saveActivity")
	public ModelAndView saveActivity(Activity activity) {
		activityRepository.save(activity);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "Activity details recorded successfully");
		modelAndView.setViewName("activityResult");
		return modelAndView;
	}
	
	
	    
	    @RequestMapping(value = "/self-service", method = RequestMethod.GET)
	    public ModelAndView showSelfServiceScreen() {
	        ModelAndView modelAndView = new ModelAndView("self-service");
	        return modelAndView;
	    }
	    
	    @Autowired
	    private DiabetesRiskService diabetesRiskService;
	    
	    @RequestMapping(value = "/calculateDiabetesRisk", method = RequestMethod.POST)
	    public ModelAndView calculateDiabetesRisk(@ModelAttribute("diabetesRisk") DiabetesRisk diabetesRisk) {
	        double diabetesRiskValue = diabetesRiskService.calculateRisk(diabetesRisk);
	        ModelAndView modelAndView = new ModelAndView();
	        modelAndView.setViewName("diabetesRiskResult");
	        modelAndView.addObject("diabetesRiskValue", diabetesRiskValue);
	        return modelAndView;
	    }
	
}	
	    