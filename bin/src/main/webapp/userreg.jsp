<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<title>Patient Monitoring Portal</title>
<meta content="width=device-width, initial-scale=1.0" name="viewport">
<meta content="Free HTML Templates" name="keywords">
<meta content="Free HTML Templates" name="description">

<!-- Favicon -->
<link href="img/favicon.ico" rel="icon">

<!-- Google Web Fonts -->
<link rel="preconnect" href="https://fonts.gstatic.com">
<link
	href="https://fonts.googleapis.com/css2?family=Roboto+Condensed:wght@400;700&family=Roboto:wght@400;700&display=swap"
	rel="stylesheet">

<!-- Icon Font Stylesheet -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.0/css/all.min.css"
	rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css"
	rel="stylesheet">

<!-- Libraries Stylesheet -->
<link href="lib/owlcarousel/assets/owl.carousel.min.css"
	rel="stylesheet">
<link href="lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css"
	rel="stylesheet" />

<!-- Customized Bootstrap Stylesheet -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Template Stylesheet -->
<link href="css/style.css" rel="stylesheet">
<style>
.card-registration .select-input.form-control[readonly]:not([disabled])
	{
	font-size: 1rem;
	line-height: 2.15;
	padding-left: .75em;
	padding-right: .75em;
}

.card-registration .select-arrow {
	top: 13px;
}
</style>
</head>

<body>
	<!-- Topbar Start -->
	<div class="container-fluid py-2 border-bottom d-none d-lg-block">
		<div class="container">
			<div class="row">
				<div class="col-md-6 text-center text-lg-start mb-2 mb-lg-0">
					<div class="d-inline-flex align-items-center">
						<a class="text-decoration-none text-body pe-3" href=""><i
							class="bi bi-telephone me-2"></i>+012 345 6789</a> <span
							class="text-body">|</span> <a
							class="text-decoration-none text-body px-3" href=""><i
							class="bi bi-envelope me-2"></i>info@example.com</a>
					</div>
				</div>
				<div class="col-md-6 text-center text-lg-end">
					<div class="d-inline-flex align-items-center">
						<a class="text-body px-2" href=""> <i
							class="fab fa-facebook-f"></i>
						</a> <a class="text-body px-2" href=""> <i class="fab fa-twitter"></i>
						</a> <a class="text-body px-2" href=""> <i
							class="fab fa-linkedin-in"></i>
						</a> <a class="text-body px-2" href=""> <i
							class="fab fa-instagram"></i>
						</a> <a class="text-body ps-2" href=""> <i class="fab fa-youtube"></i>
						</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Topbar End -->


	<!-- Navbar Start -->
	<div class="container-fluid sticky-top bg-white shadow-sm">
		<div class="container">
			<nav
				class="navbar navbar-expand-lg bg-white navbar-light py-3 py-lg-0">
				<a href="index.html" class="navbar-brand">
					<h1 class="m-0 text-uppercase text-primary">
						<i class="fa fa-clinic-medical me-2"></i>PATIENT HEALTH MONITORING
					</h1>
				</a>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarCollapse">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarCollapse">
					<div class="navbar-nav ms-auto py-0">
						<a href="/" class="nav-item nav-link active">Home</a> <a
							href="/about" class="nav-item nav-link">About</a> <a
							href="/contact" class="nav-item nav-link">Contact</a>
					</div>
				</div>
			</nav>
		</div>
	</div>
	<!-- Navbar End -->

	<section class="vh-100">
		<div class="container-fluid h-custom">
			<div
				class="row d-flex justify-content-center align-items-center h-100">
				<div class="col-md-9 col-lg-6 col-xl-5">
					<img
						src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.webp"
						class="img-fluid" alt="Sample image">
				</div>

				<div class="col-md-8 col-lg-6 col-xl-4 offset-xl-1">
					<form action="/patientReg" method="post">
						<br>
						<div class="text-center" align="center">
							<h1 class="text-center">Patient Registration Page</h1>

						</div>

						<br>

						<div class="row">
							<div class="col-md-6 mb-4">
								<div class="form-outline">
									<label class="form-label" for="form3Example1m">First
										name</label> <input type="text" id="form3Example1m"
										class="form-control form-control-lg" placeholder="First Name"
										name="patientFname" />

								</div>
							</div>
							<div class="col-md-6 mb-4">
								<div class="form-outline">
									<label class="form-label" for="form3Example1n">Last
										name</label> <input type="text" id="form3Example1n"
										class="form-control form-control-lg" placeholder="Last Name"
										name="patientLname" />

								</div>
							</div>
						</div>

						<div class="form-outline mb-4">
							<label class="form-label" for="form3Example97">Email ID</label> <input
								type="text" id="form3Example97"
								class="form-control form-control-lg" placeholder="Email-ID"
								name="patientEmail" />

						</div>
						<div class="form-outline mb-4">
							<label class="form-label" for="form3Example99">Phone
								Number</label> <input type="number" id="form3Example99"
								class="form-control form-control-lg"
								placeholder="Contact Number" name="patientPhNo" />

						</div>
						<div class="form-outline mb-4">
							<label class="form-label" for="form3Example99">Age</label> <input
								type="number" id="form3Example99"
								class="form-control form-control-lg" placeholder="Age"
								name="patientAge" />

						</div>


						<div
							class="d-md-flex justify-content-start align-items-center mb-4 py-2">

							<h6 class="mb-0 me-4">Gender:</h6>

							<div class="form-check form-check-inline mb-0 me-4">
								<input class="form-check-input" type="radio"
									name="patientGender" id="femaleGender" value="Female" /> <label
									class="form-check-label" for="femaleGender">Female</label>
							</div>

							<div class="form-check form-check-inline mb-0 me-4">
								<input class="form-check-input" type="radio"
									name="patientGender" id="maleGender" value="Male" /> <label
									class="form-check-label" for="maleGender">Male</label>
							</div>

							<div class="form-check form-check-inline mb-0">
								<input class="form-check-input" type="radio"
									name="patientGender" id="otherGender" value="Other" /> <label
									class="form-check-label" for="otherGender">Other</label>
							</div>

						</div>


						<div class="form-outline mb-4">
							<label class="form-label" for="form3Example3">USER ID</label> <input
								type="text" id="form3Example3"
								class="form-control form-control-lg" placeholder="User ID"
								name="patientUserId" />

						</div>

						<!-- Password input -->
						<div class="form-outline mb-3">
							<label class="form-label" for="form3Example4">Password</label> <input
								type="password" id="form3Example4"
								class="form-control form-control-lg"
								placeholder="Enter password" name="patientPassword" />

						</div>
						<div class="form-outline mb-4">
							<label class="form-label" for="form3Example3">City</label> <input
								type="text" id="form3Example3"
								class="form-control form-control-lg" placeholder="City"
								name="patientCity" />

						</div>



						<div class="text-center text-lg-start mt-4 pt-2">
							<button type="submit" class="btn btn-primary btn-lg"
								style="padding-left: 2.5rem; padding-right: 2.5rem;">Register</button>
							<p class="small fw-bold mt-2 pt-1 mb-0">
								Already have an account? <a href="/userlogin"
									class="link-danger">Login</a>
							</p>
						</div>
					</form>

					<br>
				</div>
			</div>
		</div>

		<div
			class="d-flex flex-column flex-md-row text-center text-md-start justify-content-between py-4 px-4 px-xl-5 bg-primary">
			<!-- Copyright -->
			<div class="text-white mb-3 mb-md-0">Copyright © 2020. All
				rights reserved.</div>
			<!-- Copyright -->

			<!-- Right -->
			<div>
				<a href="#!" class="text-white me-4"> <i
					class="fab fa-facebook-f"></i>
				</a> <a href="#!" class="text-white me-4"> <i class="fab fa-twitter"></i>
				</a> <a href="#!" class="text-white me-4"> <i class="fab fa-google"></i>
				</a> <a href="#!" class="text-white"> <i class="fab fa-linkedin-in"></i>
				</a>
			</div>
			<!-- Right -->
		</div>
	</section>


	<!-- Template Javascript -->
	<script src="js/main.js"></script>
</body>

</html>