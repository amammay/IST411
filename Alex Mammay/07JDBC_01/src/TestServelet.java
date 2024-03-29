import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.annotation.Resource;
import javax.print.attribute.standard.PrinterLocation;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;


/**
 * @author mammay
 *
 */
@SuppressWarnings("serial")
@WebServlet("/TestServelt")
public class TestServelet extends HttpServlet
{

	
	@Resource(name = "jdbc/student_tracker")
	private DataSource dataSource;
	
	
	

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) 
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/plain");
		
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		
		try 
		{
		
			myConn = dataSource.getConnection();
			
			
			String sql = "select * from student";
			
			myStmt = myConn.createStatement();
			
			myRs = myStmt.executeQuery(sql);
		
			while ( myRs.next()){
				String email = myRs.getString("email");
				
				out.println(email);
				System.out.println(email);
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			out.println(e.getMessage());
		}
		
		
				
		
		
		
	}
	
	
	
	
}
