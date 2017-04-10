
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import java.sql.Blob;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
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

		//PrintWriter out = response.getWriter();
		response.setContentType("text/plain");
		
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		ServletOutputStream out = response.getOutputStream();

		Blob image = null;
		
		try {
			myConn = dataSource.getConnection();
			
			String mySql = "select resume from employees where email='mary.public@foo.com'";
			myStmt = myConn.createStatement();
			
			myRs = myStmt.executeQuery(mySql);
				
		

			while (myRs.next()) {
				
			
				image = myRs.getBlob(1);
				
				
				
			}
			
			  response.setContentType("image/jpg");
			  InputStream in = image.getBinaryStream();
			  int length = (int) image.length();
			  int bufferSize = 1024;
			  byte[] buffer = new byte[bufferSize];
			  while ((length = in.read(buffer)) != -1) {
			  out.write(buffer, 0, length);
			  }
			  in.close();
			  out.flush();
			
				

		
		} catch (Exception exc) {
			exc.printStackTrace();
			//out.println(exc.getMessage());
		}
	}

}
