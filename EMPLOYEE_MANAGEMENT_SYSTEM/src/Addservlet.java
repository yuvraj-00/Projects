import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class Addservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Addservlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
	
		//getting input values from jsp page
		String id = request.getParameter("emp_id"); 
		String fname = request.getParameter("first_name");
		String lname= request.getParameter("last_name");
		int Age =Integer.parseInt( request.getParameter("age"));
		String Gender = request.getParameter("gender");
		String email = request.getParameter("email");
		int mobile =Integer.parseInt( request.getParameter("phone"));
		String address = request.getParameter("address");

		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/dealer"; //PostgreSQL URL and followed by the database name
 		String username = "postgres"; //PostgreSQL username
 		String password = "Ankit081020#"; //PostgreSQL password
		
 		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(url, username, password); //attempting to connect to PostgreSQL database
 		System.out.println("Printing connection object "+con);
 		
 		

 		
 		PreparedStatement insert = con.prepareStatement("insert into employee values(?,?,?,?,?,?,?,?)");
		insert.setString(1, id);
		insert.setString(2, fname);
		insert.setString(3, lname);
		insert.setInt(4, Age);
		insert.setString(5, Gender);
		insert.setInt(6, mobile);
		insert.setString(7, email);
		insert.setString(8, address);
		
		int execut = insert.executeUpdate();
	
			
			RequestDispatcher rd = request.getRequestDispatcher("Addresult.jsp");
			rd.forward(request, response);
		
		
		

		}
		 catch (Exception e) 
 		{
 			e.printStackTrace();
 		}

	
	}


}


