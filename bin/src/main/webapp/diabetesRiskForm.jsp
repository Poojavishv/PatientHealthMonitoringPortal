<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Calculate Diabetes Risk</title>
</head>
<body>
    <h2>Calculate Diabetes Risk</h2>
    <form:form method="POST" modelAttribute="diabetesRisk" action="${pageContext.request.contextPath}/calculateDiabetesRisk">
        <table>
            <tr>
                <td>Patient ID:</td>
                <td><form:input path="patientId" /></td>
            </tr>
            <tr>
                <td>Time of the Day:</td>
                <td><form:input path="timeOfDay" /></td>
            </tr>
            <tr>
                <td>RBC Count:</td>
                <td><form:input path="rbcCount" /></td>
            </tr>
            
            <tr>
                <td>WBC Count:</td>
                <td><form:input path="wbcCount" /></td>
            </tr>
            <tr>
                <td>Platelet Count:</td>
                <td><form:input path="plateletCount" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Calculate Diabetes Risk" /></td>
            </tr>
        </table>
    </form:form>
</body>
</html>