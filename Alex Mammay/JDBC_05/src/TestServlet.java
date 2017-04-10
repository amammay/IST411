
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {

	@Resource(name = "jdbc/megamindsdb")
	private DataSource dataSource;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/plain");
		
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		InputStream input = null;
		FileOutputStream output = null;
		
		try {
			myConn = dataSource.getConnection();
			
			String mySql = "select * from employees";
			myStmt = myConn.createStatement();
			
			myRs = myStmt.executeQuery(mySql);
			File thePicture = new File("photo_from_db.jpg");
			output = new FileOutputStream(thePicture);
		
			while (myRs.next()) {
				String email = myRs.getString("email");
				input =  myRs.getBinaryStream("resume");
				
				
				byte[] buffer = new byte[1024];
				
				while(input.read(buffer) > 0 )
				{
					output.write(buffer);
				}
				
				
			}
				

		
		} catch (Exception exc) {
			exc.printStackTrace();
			out.println(exc.getMessage());
		}
	}

}
