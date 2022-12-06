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
 * Servlet implementation class SellerServlet
 */
@WebServlet("/SellerServlet")
public class SellerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public SellerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
	
		//getting input values from jsp page
		String s_id = request.getParameter("id"); 

		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/dealer"; //PostgreSQL URL and followed by the database name
 		String username = "postgres"; //PostgreSQL username
 		String password = "Ankit081020#"; //PostgreSQL password
		
 		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(url, username, password); //attempting to connect to PostgreSQL database
 		System.out.println("Printing connection object "+con);

 		
 		PreparedStatement delete = con.prepareStatement("delete from employee where emp_id=?");
		delete.setString(1, s_id);
		int execut = delete.executeUpdate();
	
			
			RequestDispatcher rd = request.getRequestDispatcher("SellerResult.jsp");
			rd.forward(request, response);
		
		
		

		}
		 catch (Exception e) 
 		{
 			e.printStackTrace();
 		}

	
	}


}


