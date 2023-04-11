<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>



<%
	String UserId = request.getParameter("UserId");
	String driver = "com.mysql.jdbc.Driver";
	String connectionUrl = "jdbc:mysql://localhost/";
	String database = "patient";
	String userid = "root";
	String password = "root";
	//String id = request.getParameter("UserId");
	try {
		Class.forName(driver);
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	Connection connection = null;
	Statement statement = null;
	ResultSet resultSet = null;
%>
<html>
<head>
<link href="File.css" rel="stylesheet" type="text/css">
<style type="text/css">
</style>
</head>
<body>
	<div class="container">
		<header> <big>PATIENT MONITORING PORTAL</big> </header>
		<br> <br>
		<h5>
			<font color="red">Click On Update To Update Diet & Exercise</font>
		</h5>
<h3><center>UPDATE Diet & Exercise</center></h3>

		<table id="myTable">
			<table border="1">
				<tr>
					<td>Diet</td>
					<td>Exercise</td>
					<td width="150">update</td>
				</tr>


				<%
					try {
						connection = DriverManager.getConnection(connectionUrl + database, userid, password);
						statement = connection.createStatement();

						String sql = "select * from patient_reg";

						resultSet = statement.executeQuery(sql);
						while (resultSet.next()) {
				%>

				<tr>
					<td><input type="text" name="Diet"
						value="<%=resultSet.getString("UserId")%>"></td>
					<td><%=resultSet.getString("Diet")%></td>
					<td><%=resultSet.getString("Exercise")%></td>
					
					<td><a
						href="Next.jsp?UserId=<%=resultSet.getString("UserId")%>">update</a></td>

				</tr>






				<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
			</table>
</body>
</html>
