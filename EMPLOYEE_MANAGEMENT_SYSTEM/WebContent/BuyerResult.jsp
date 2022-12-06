<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enter details</title>
</head>
<body>

<form action="Addservlet" method="post">

					<center>
					<h1>Add Details </h1>
					<table>
<p> Employee_id:
   <input type="text" name="emp_id"></p>
   
   <p> First_name:
   <input type="text" name="first_name"></p>
   
   <p> Last_name:
   <input type="text" name="last_name"></p>
   
   <p> age:
   <input type="text" name="age"></p>
   
   <p> Gender:
   <input type="text" name="gender"></p>
   
    <p> Email_id:
   <input type="text" name="email"></p>
   
    <p> Phone_no:
   <input type="text" name="phone"></p>
   
   <p> Address:
   <input type="text" name="address"></p>
   
    <form action="AddServlet" method="post">
   <input type="submit" value="Add" name="submit">
   </form>
   </table>
</center>
</body>
</html>