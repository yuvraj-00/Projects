<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<h1>Login  </h1>
<form name="Menu" action="BuyerServlet" method="post">
<center>
<p> Username:
   <input type="text" name="u_name"></p>
   
   <p> Password:
   <input type="password" name="password"></p>
  
   <input type="submit" value="submit" name="submit">
</center>
</form>
<script type="text/javascript">
 function openPage(pageURL)
 {
 window.location.href = pageURL;
 }
</script>
</body>
</html>