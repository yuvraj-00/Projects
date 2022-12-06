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
 * Servlet implementation class StudentServlet
 */
@WebServlet("/BuyerServlet")
public class BuyerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public BuyerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
	
		
		int pass =Integer.parseInt( request.getParameter("password") );
//		


		Connection con = null;
 		String url = "jdbc:mysql://localhost:3306/dealer"; //PostgreSQL URL and followed by the database name
 		String username = "postgres"; //PostgreSQL username
 		String password = "Ankit081020#"; //PostgreSQL password
		
 		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(url, username, password); //attempting to connect to PostgreSQL database
 		System.out.println("Printing connection object "+con);

 		
 		PreparedStatement check = con.prepareStatement("SELECT COUNT(*) FROM username WHERE u_name = ? and password=?");
		check.setString(1, u_name);
		check.setInt(2, pass);
		ResultSet count = check.executeQuery();
		count.next();
		if(count.getInt("COUNT(*)") != 0)
		{
//			PreparedStatement addlogin = con.prepareStatement("insert into logged values(?)");
//			addlogin.setInt(1, loginId);
//			int loggedSet = addlogin.executeUpdate();
			//loggedSet.next();
			
			RequestDispatcher rd = request.getRequestDispatcher("Buyer.jsp");
			rd.forward(request, response);
		}
 		
 		else {
 			System.out.println("User does not exist.");
 		}
//		

		}
		 catch (Exception e) 
 		{
 			e.printStackTrace();
 		}

	
	}


}


