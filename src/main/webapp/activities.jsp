<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<title>My Activities</title>
</head>
<body>
	<h1>My Activities</h1>

	<form action="saveActivity" method="post">
		<table>
			<tr>
				<td><label for="patientId">Patient ID:</label></td>
				<td><input type="text" name="patientId" id="patientId"
					value="${patientId}" readonly></td>
			</tr>
			<tr>
				<td><label for="date">Date:</label></td>
				<td><input path="date" type="date" id="date" name="datetime" ></td>
			</tr>
			<tr>
<<<<<<< HEAD
				<td><label for="activity1">Activity:</label></td>
				<td><input type="text" name="activity1" id="activity1"></td>
=======
				<td><label for="activity">Activity:</label></td>
				<td><input type="text" name="activity" id="activity"></td>
>>>>>>> branch 'master' of https://github.com/Poojavishv/PatientHealthMonitoringPortal.git
			</tr>

			<tr>
				<td><label for="timeOfWorkout">Time of workout:</label></td>
				<td><input type="time" name="timeOfWorkout" id="timeOfWorkout"></td>
			</tr>
			<tr>
				<td></td>
				<td><button type="submit">Save</button></td>
			</tr>
		</table>
	</form>

	<table>
		<thead>
			<tr>
				<th>Date</th>
				<th>Activity</th>
				<th>Time of workout</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="activity" items="${activities}">
				<tr>
					<td>${activity.date}</td>
					<td>${activity.activity}</td>
					<td>${activity.timeOfWorkout}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>