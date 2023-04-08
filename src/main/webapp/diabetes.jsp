<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculate Diabetes Risk</title>
</head>
<body>
<h1>Calculate Diabetes Risk</h1>

<form action="calculateDiabetesRisk" method="post">
    <table>
        <tr>
            <td><label for="name">Name:</label></td>
            <td><input type="text" name="name" id="name"></td>
        </tr>
        <tr>
            <td><label for="age">Age:</label></td>
            <td><input type="number" name="age" id="age"></td>
        </tr>
        <tr>
            <td><label for="bloodSugar">Blood Sugar:</label></td>
            <td><input type="number" name="bloodSugar" id="bloodSugar"></td>
        </tr>
        <tr>
            <td><label for="BMI">BMI:</label></td>
            <td><input type="number" name="BMI" id="BMI"></td>
        </tr>
        <tr>
            <td></td>
            <td><button type="submit">Calculate</button></td>
        </tr>
    </table>
</form>

</body>
</html>
        