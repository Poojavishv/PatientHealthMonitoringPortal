<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Calculate Diabetes Risk</title>
</head>
<body>
    <h2>Calculate Diabetes Risk</h2>
    <form action="/generateDiabetesRisk" >
    <input type="text" name="pid" value="${diabetesRisk.getPatientId() }" style="display: none;"> 
    <table>
    	<tr><td>Patient ID:</td><th>${diabetesRisk.getPatientId() }</th></tr>
    	<tr><td>Time of the Day:</td><th>${diabetesRisk.getBloodCount().getTimeOfDay() }</th></tr>
    	<tr><td>RBC Count:</td><th>${diabetesRisk.getBloodCount().getRbcCount() }</th></tr>
    	<tr><td>WBC Count:</td><th>${diabetesRisk.getBloodCount().getWbcCount() }</th></tr>
    	<tr><td>Platelet Count:</td><th>${diabetesRisk.getBloodCount().getPlateletCount() }</th></tr>
    	<tr><th colspan="2"><input type="submit" value= "Calculate Diabetes Risk "/>  </th></tr>
    </table>
    </form>
    
    
 </body>
</html>