<%@page import="com.example.demo.model.BloodCount"%>
<%@page import="com.example.demo.model.BMI"%>
<%@page import="com.example.demo.model.GlucoseI"%>
<%@page import="com.example.demo.model.CalorieIntake"%>
<%@page import="com.example.demo.model.CholestrolMonitor"%>
<%@page import="com.example.demo.model.Pressure"%>
<%@page import="com.example.demo.model.Thyroid"%>

<%@page import="java.util.Iterator"%>
<%@page import="com.example.demo.model.PatientRecords"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <title>Patient Monitoring Portal </title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta content="Free HTML Templates" name="keywords">
    <meta content="Free HTML Templates" name="description">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <!-- Favicons -->
  <link href="assets/img/favicon.png" rel="icon">
  <link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="assets/vendor/fontawesome-free/css/all.min.css" rel="stylesheet">
  <link href="assets/vendor/animate.css/animate.min.css" rel="stylesheet">
  <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
  <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
  <link href="assets/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
  <link href="assets/vendor/remixicon/remixicon.css" rel="stylesheet">
  <link href="assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">

  <!-- Template Main CSS File -->
  <link href="assets/css/style.css" rel="stylesheet">

    <!-- Favicon -->
    <link href="img/favicon.ico" rel="icon">

    <!-- Google Web Fonts -->
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:wght@400;700&family=Roboto:wght@400;700&display=swap" rel="stylesheet">  

    <!-- Icon Font Stylesheet -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.0/css/all.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

    <!-- Libraries Stylesheet -->
    <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
    <link href="lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css" rel="stylesheet" />

    <!-- Customized Bootstrap Stylesheet -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Template Stylesheet -->
    <link href="css/style.css" rel="stylesheet">
    <style>
    .divider:after,
.divider:before {
content: "";
flex: 1;
height: 1px;
background: #eee;
}
.h-custom {
height: calc(100% - 73px);
}
@media (max-width: 450px) {
.h-custom {
height: 100%;
}
}
html,
body,
.intro {
  height: 100%;
}

table td,
table th {
  text-overflow: ellipsis;
  white-space: nowrap;
  overflow: hidden;
}

.card {
  border-radius: .5rem;
}

.mask-custom {
  background: rgba(24, 24, 16, .2);
  border-radius: 2em;
  backdrop-filter: blur(25px);
  border: 2px solid rgba(255, 255, 255, 0.05);
  background-clip: padding-box;
  box-shadow: 10px 10px 10px rgba(46, 54, 68, 0.03);
}
</style>

</head>

<body>
<%
	response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
	response.setHeader("Pragma", "no-cache");
	
	if(session.getAttribute("user")==null)
	{
		response.sendRedirect("/logoutDoctor");
	}
%>
    <!-- Topbar Start -->
    <div class="container-fluid py-2 border-bottom d-none d-lg-block">
        <div class="container">
            <div class="row">
                <div class="col-md-6 text-center text-lg-start mb-2 mb-lg-0">
                    <div class="d-inline-flex align-items-center">
                        <a class="text-decoration-none text-body pe-3" href=""><i class="bi bi-telephone me-2"></i>+012 345 6789</a>
                        <span class="text-body">|</span>
                        <a class="text-decoration-none text-body px-3" href=""><i class="bi bi-envelope me-2"></i>info@example.com</a>
                    </div>
                </div>
                <div class="col-md-6 text-center text-lg-end">
                    <div class="d-inline-flex align-items-center">
                        <a class="text-body px-2" href="">
                            <i class="fab fa-facebook-f"></i>
                        </a>
                        <a class="text-body px-2" href="">
                            <i class="fab fa-twitter"></i>
                        </a>
                        <a class="text-body px-2" href="">
                            <i class="fab fa-linkedin-in"></i>
                        </a>
                        <a class="text-body px-2" href="">
                            <i class="fab fa-instagram"></i>
                        </a>
                        <a class="text-body ps-2" href="">
                            <i class="fab fa-youtube"></i>
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Topbar End -->

<%! int i=0; %>
    <!-- Navbar Start -->
    <div class="container-fluid sticky-top bg-white shadow-sm">
        <div class="container">
            <nav class="navbar navbar-expand-lg bg-white navbar-light py-3 py-lg-0">
                <a href="index.html" class="navbar-brand">
                    <h1 class="m-0 text-uppercase text-primary"><i class="fa fa-clinic-medical me-2"></i>PATIENT HEALTH MONITORING</h1>
                </a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarCollapse">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarCollapse">
                    <div class="navbar-nav ms-auto py-0">
                        <a href="/dHome" class="nav-item nav-link active">Home</a>
                        <a href="/about" class="nav-item nav-link">About</a>
                        <a href="/contact" class="nav-item nav-link">Contact</a>
                        <a href="/logoutDoctor" class="nav-item nav-link">Logout</a>
                    </div>
                </div>
            </nav>
        </div>
    </div>
    <!-- Navbar End -->

<!-- ======= Appointment Section ======= -->
    <section id="appointment" class="appointment section-bg">
      <div class="container"> <h4 style="color: green" align="center">${successMessage}</h4>

        

        <div class="section-title">
          <h2>${pName } Health Records</h2>
          </div>
          
         <div class="accordion" id="accordionPanelsStayOpenExample">
  <div class="accordion-item">
    <h2 class="accordion-header" id="panelsStayOpen-headingOne">
      <button class="accordion-button" type="button" data-bs-toggle="collapse" data-bs-target="#panelsStayOpen-collapseOne" aria-expanded="true" aria-controls="panelsStayOpen-collapseOne">
        BMI Report
      </button>
    </h2>
    <div id="panelsStayOpen-collapseOne" class="accordion-collapse collapse show" aria-labelledby="panelsStayOpen-headingOne">
      <div class="accordion-body">
        <table class="table">
      <thead>
      <tr>
      <th scope="col">#</th>
      <th scope="col">BMI Value</th>
      <th scope="col">Date</th>
      </tr>
      </thead>
      <tbody>
      <%
      ArrayList<BMI> bmiList = (ArrayList) request.getAttribute("bmiValues");
     
		if(request.getAttribute("bmiValues") !=null)
		{
			 int i=0;
			Iterator<BMI> bmiRecordsIterator =  bmiList.iterator();
			while(bmiRecordsIterator.hasNext())
			{
				BMI bmi = bmiRecordsIterator.next();
      %>
      <tr>
      <td scope="row"><%= ++i %>
      <td><%= bmi.getBmi() %></td>
      <td><%= bmi.getDateBMI() %></td>
      </tr>
      <% } }  %>
      </tbody>
      </table>
      </div>
    </div>
  </div>
  <div class="accordion-item">
    <h2 class="accordion-header" id="panelsStayOpen-headingTwo">
      <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#panelsStayOpen-collapseTwo" aria-expanded="false" aria-controls="panelsStayOpen-collapseTwo">
        Blood Count Report
      </button>
    </h2>
    <div id="panelsStayOpen-collapseTwo" class="accordion-collapse collapse" aria-labelledby="panelsStayOpen-headingTwo">
      <div class="accordion-body">
        <table class="table">
      <thead>
      <tr>
      <th scope="col">#</th>
      <th scope="col">RBC Count</th>
      <th scope="col">WBC Count</th>
      <th scope="col">Platelet Count</th>
      </tr>
      </thead>
      <tbody>
      <%
      ArrayList<BloodCount> bloodCountList = (ArrayList) request.getAttribute("bloodCountValues");
      
		if(request.getAttribute("bloodCountValues") !=null)
		{
			int i=0;
			Iterator<BloodCount> bloodCountRecordsIterator =  bloodCountList.iterator();
			while(bloodCountRecordsIterator.hasNext())
			{
				BloodCount bloodCountDetails = bloodCountRecordsIterator.next();
      %>
      <tr>
      <td scope="row"><%= ++i %>
      <td><%= bloodCountDetails.getRbcCount() %></td>
      <td><%= bloodCountDetails.getWbcCount() %></td>
      <td><%= bloodCountDetails.getPlateletCount() %></td>
      </tr>
      <% } }  %>
      </tbody>
      </table>
      </div>
    </div>
  </div>
  <div class="accordion-item">
    <h2 class="accordion-header" id="panelsStayOpen-headingThree">
      <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#panelsStayOpen-collapseThree" aria-expanded="false" aria-controls="panelsStayOpen-collapseThree">
        Glucose Report
      </button>
    </h2>
    <div id="panelsStayOpen-collapseThree" class="accordion-collapse collapse" aria-labelledby="panelsStayOpen-headingThree">
      <div class="accordion-body">
        <table class="table">
      <thead>
      <tr>
      <th scope="col">#</th>
      <th scope="col">Gucose Level</th>
      <th scope="col">Date</th>
      </tr>
      </thead>
      <tbody>
      <%
      ArrayList<GlucoseI> glucoseList = (ArrayList) request.getAttribute("glucoseValues");
      
		if(request.getAttribute("glucoseValues") !=null)
		{
			int i=0;
			Iterator<GlucoseI> glucoseRecordsIterator =  glucoseList.iterator();
			while(glucoseRecordsIterator.hasNext())
			{
				GlucoseI glucoseDetails = glucoseRecordsIterator.next();
      %>
      <tr>
      <td scope="row"><%= ++i %>
      <td><%= glucoseDetails.getGlucoseLevel()%></td>
      <td><%= glucoseDetails.getDateGlucose() %></td>
      
      </tr>
      <% } }  %>
      </tbody>
      </table>
      </div>
    </div>
  </div>
   <div class="accordion-item">
    <h2 class="accordion-header" id="panelsStayOpen-headingFour">
      <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#panelsStayOpen-collapseFour" aria-expanded="false" aria-controls="panelsStayOpen-collapseFour">
        Calorie Intake Report
      </button>
    </h2>
    <div id="panelsStayOpen-collapseFour" class="accordion-collapse collapse" aria-labelledby="panelsStayOpen-headingFour">
      <div class="accordion-body">
    <table class="table">
      <thead>
      <tr>
      <th scope="col">#</th>
      <th scope="col">calories</th>
      <th scope="col">Time of Intake</th>
      </tr>
      </thead>
      <tbody>
      <%
      ArrayList<CalorieIntake> calorieIntakeList = (ArrayList) request.getAttribute("calorieIntakeValues");
      
		if(request.getAttribute("calorieIntakeValues") !=null)
		{
			int i=0;
			Iterator<CalorieIntake> calorieIntakeRecordsIterator =  calorieIntakeList.iterator();
			while(calorieIntakeRecordsIterator.hasNext())
			{
				CalorieIntake calorieIntakeDetails = calorieIntakeRecordsIterator.next();
      %>
      <tr>
      <td scope="row"><%= ++i %>
      <td><%= calorieIntakeDetails.getCalories()%></td>
      <td><%= calorieIntakeDetails.getTimeOfIntake() %></td>
      
      </tr>
      <% } }  %>
      </tbody>
      </table>
      </div>
    </div>
  </div>
    <div class="accordion-item">
    <h2 class="accordion-header" id="panelsStayOpen-headingFive">
      <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#panelsStayOpen-collapseFive" aria-expanded="false" aria-controls="panelsStayOpen-collapseFive">
        Cholestrol Report
      </button>
    </h2>
    <div id="panelsStayOpen-collapseFive" class="accordion-collapse collapse" aria-labelledby="panelsStayOpen-headingFive">
      <div class="accordion-body">
    <table class="table">
      <thead>
      <tr>
      <th scope="col">#</th>
      <th scope="col">Cholestrol Level</th>
      <th scope="col">Time of day</th>
      </tr>
      </thead>
      <tbody>
      <%
      ArrayList<CholestrolMonitor> cholestrolMonitorList = (ArrayList) request.getAttribute("cholestrolMonitorValues");
      
		if(request.getAttribute("cholestrolMonitorValues") !=null)
		{
			int i=0;
			Iterator<CholestrolMonitor> cholestrolMonitorRecordsIterator =  cholestrolMonitorList.iterator();
			while(cholestrolMonitorRecordsIterator.hasNext())
			{
				CholestrolMonitor cholestrolMonitorDetails = cholestrolMonitorRecordsIterator.next();
      %>
      <tr>
      <td scope="row"><%= ++i %>
      <td><%= cholestrolMonitorDetails.getCholestrolLevel()%></td>
      <td><%= cholestrolMonitorDetails.getTimeOfDayCholestrolMonitor() %></td>
      
      </tr>
      <% } }  %>
      </tbody>
      </table>
      </div>
    </div>
  </div>
   <div class="accordion-item">
    <h2 class="accordion-header" id="panelsStayOpen-headingSix">
      <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#panelsStayOpen-collapseSix" aria-expanded="false" aria-controls="panelsStayOpen-collapseSix">
        Pressure Report
      </button>
    </h2>
    <div id="panelsStayOpen-collapseSix" class="accordion-collapse collapse" aria-labelledby="panelsStayOpen-headingSix">
      <div class="accordion-body">
    <table class="table">
      <thead>
      <tr>
      <th scope="col">#</th>
      <th scope="col">Pressure Level</th>
      <th scope="col">Time of day</th>
      </tr>
      </thead>
      <tbody>
      <%
      ArrayList<Pressure> pressureList = (ArrayList) request.getAttribute("pressureValues");
      
		if(request.getAttribute("pressureValues") !=null)
		{
			int i=0;
			Iterator<Pressure> pressureRecordsIterator =  pressureList.iterator();
			while(pressureRecordsIterator.hasNext())
			{
				Pressure pressureDetails = pressureRecordsIterator.next();
      %>
      <tr>
      <td scope="row"><%= ++i %>
      <td><%= pressureDetails.getPressureLevel()%></td>
      <td><%= pressureDetails.getTimeOfDayPressure() %></td>
      
      </tr>
      <% } }  %>
      </tbody>
      </table>
      </div>
    </div>
  </div>
  <div class="accordion-item">
    <h2 class="accordion-header" id="panelsStayOpen-headingSeven">
      <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#panelsStayOpen-collapseSeven" aria-expanded="false" aria-controls="panelsStayOpen-collapseSeven">
        Thyroid Report
      </button>
    </h2>
    <div id="panelsStayOpen-collapseSeven" class="accordion-collapse collapse" aria-labelledby="panelsStayOpen-headingSeven">
      <div class="accordion-body">
    <table class="table">
      <thead>
      <tr>
      <th scope="col">#</th>
      <th scope="col">Thyroid Level</th>
      <th scope="col">Time of day</th>
      </tr>
      </thead>
      <tbody>
      <%
      ArrayList<Thyroid> thyroidList = (ArrayList) request.getAttribute("thyroidValues");
      
		if(request.getAttribute("thyroidValues") !=null)
		{
			int i=0;
			Iterator<Thyroid> thyroidIterator =  thyroidList.iterator();
			while(thyroidIterator.hasNext())
			{
				Thyroid thyroidDetails = thyroidIterator.next();
      %>
      <tr>
      <td scope="row"><%= ++i %>
      <td><%= thyroidDetails.getThyroidLevel()%></td>
      <td><%= thyroidDetails.getTimeOfDayThyroid() %></td>
      
      </tr>
      <% } }  %>
      </tbody>
      </table>
      </div>
    </div>
  </div>
  
  <form action="/SavePatientHealthRecord" method="post" role="form" class="php-email-form">
  <input type="text" name="patientId" value="${patientDetails.getPatientEmail() }" style="display: none;">
  <input type="text" name="patientName" value="${patientDetails.getPatientFname()}  ${patientDetails.getPatientLname() }" style="display: none;">
  <input type="text" name="docId" value="${doctorDetails.getDocEmail() }" style="display: none;">
  <input type="text" name="docName" value="${doctorDetails.getDocFname() } ${doctorDetails.getDocLname()}" style="display: none;">
  <div class="form-group mt-3">
            <textarea class="form-control" name="updatePatientRec" id="updatePatientRec" rows="5" placeholder="update Patient Records"></textarea>
            <div class="validate"></div>
          </div>
          <div class="text-center"><button type="submit">Update Records</button></div>
   </form>
          <br>
          <div class="text-center" ><a href="/dHome">Back to Home</a></div>
</div>
        
          
         
         
      </div>
    </section><!-- End Appointment Section -->

 <div
    class="d-flex flex-column flex-md-row text-center text-md-start justify-content-between py-4 px-4 px-xl-5 bg-primary">
    <!-- Copyright -->
    <div class="text-white mb-3 mb-md-0">
      Copyright © 2020. All rights reserved.
    </div>
    <!-- Copyright -->

    <!-- Right -->
    <div>
      <a href="#!" class="text-white me-4">
        <i class="fab fa-facebook-f"></i>
      </a>
      <a href="#!" class="text-white me-4">
        <i class="fab fa-twitter"></i>
      </a>
      <a href="#!" class="text-white me-4">
        <i class="fab fa-google"></i>
      </a>
      <a href="#!" class="text-white">
        <i class="fab fa-linkedin-in"></i>
      </a>
    </div>
    <!-- Right -->
  </div>
   

    <!-- Template Javascript -->
    <script src="js/main.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
  
</body>


</html>