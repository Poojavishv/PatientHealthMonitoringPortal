<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>My Pressure Readings</title>
</head>
<body>
<h1>My Pressure Readings</h1>

<form action="savePressure" method="post">
    <table>
        <tr>
            <td><label for="patientId">Patient ID:</label></td>
            <td><input type="text" name="patientId" id="patientId" value="${patientId}" readonly></td>
        </tr>
        <tr>
            <td><label for="timeOfDay">Time of the Day:</label></td>
            <td><input type="time" name="timeOfDay" id="timeOfDay"></td>
        </tr>
        <tr>
            <td><label for="pressureLevel">Pressure Level:</label></td>
            <td><input type="number" name="pressureLevel" id="pressureLevel"></td>
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
            <th>Time of the Day</th>
            <th>Pressure Level</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="pressure" items="${pressures}">
            <tr>
                <td>${pressure.timeOfDay}</td>
                <td>${pressure.pressureLevel}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>

</body>
</html>