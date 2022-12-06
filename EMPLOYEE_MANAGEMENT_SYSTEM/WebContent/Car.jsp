<%@page import="java.sql.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Jsp Sample</title>
    
</head>
<body bgcolor=#00FFFF>
<form method="post">
    <%
    try
    {
    	Class.forName("com.mysql.jdbc.Driver");
        Connection con=(Connection)DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/dealer","postgres","Ankit081020#");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from car where available='Yes' ");
    %><table border=1 align=center style="text-align:center">
      <thead>
          <tr>
             <th>Car_id</th>
             <th>Model_no</th>
             <th>Model_name</th>
             <th>Brand</th>
             <th>Color</th>
             <th>Km</th>
             <th>Age</th>
             <th>Last_used</th>
          </tr>
      </thead>
      <tbody>
        <%while(rs.next())
        {
            %>
            <tr>
                <td><%=rs.getString("car_id") %></td>
                <td><%=rs.getString("model_no") %></td>
                <td><%=rs.getString("model_name") %></td>
                <td><%=rs.getString("brand") %></td>
                <td><%=rs.getString("colour") %></td>
                <td><%=rs.getString("km") %></td>
                <td><%=rs.getString("car_age") %></td>
                <td><%=rs.getString("last_used") %></td>
            </tr>
            <%}%>
           </tbody>
        </table><br>
    <%}
    catch(Exception e){
        out.print(e.getMessage());%><br><%
    }
    
    %>
</form>
</body>
</html>