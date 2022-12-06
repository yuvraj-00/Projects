<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Seller Details </h1>
<form action="SellerServlet" method="post">
			<table style="with: 50%">
				<tr>
					<td>Seller Id</td>
					<td><input type="text" name="s_id" /></td>
				</tr>
				<tr>
					<td>Aadhar No.</td>
					<td><input type="text" name="aadhar_no" /></td>
				</tr>
				<tr>
					<td>First Name</td>
					<td><input type="text" name="first_name" /></td>
				</tr>
					<tr>
					<td>Last Name</td>
					<td><input type="text" name="last_name" /></td>
				</tr>
				<tr>
					<td>age</td>
					<td><input type="text" name="age" /></td>
				</tr>
				<tr>
					<td>Email id</td>
					<td><input type="text" name="email" /></td>
				</tr>
				<tr>
					<td>Phone no</td>
					<td><input type="text" name="phone_no" /></td>
				</tr>
				
				<tr>
					<td>Car id</td>
					<td><input type="text" name="car_id" /></td>
				</tr>
				<tr>
					<td>model no</td>
					<td><input type="text" name="model_no" /></td>
				</tr>
					<tr>
					<td>model name</td>
					<td><input type="text" name="model_name" /></td>
				</tr>
				<tr>
					<td>Brand</td>
					<td><input type="text" name="brand" /></td>
				</tr>
				<tr>
					<td>color</td>
					<td><input type="text" name="colour" /></td>
				</tr>
				<tr>
					<td>Km</td>
					<td><input type="text" name="km" /></td>
				</tr>
				<tr>
					<td>Age</td>
					<td><input type="text" name="car_age" /></td>
				</tr>
                                <tr>
					<td>Last_used</td>
					<td><input type="text" name="last_used" /></td>
				</tr>
				
				</tr>
                                <tr>
					<td>Price</td>
					<td><input type="text" name="price" /></td>
				</tr>
				
				
			</table>
			<input type="submit" value="Submit" /></form>
</body>
</html>