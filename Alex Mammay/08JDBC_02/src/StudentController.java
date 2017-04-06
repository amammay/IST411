import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.application.*;
import javax.faces.context.*;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

@ManagedBean
@SessionScoped
/**
 * @author mammay
 * 
 */
public class StudentController {

	private List<Student> students;
	private StudentDbUtil studentDbUtil;
	private Logger logger = Logger.getLogger(getClass().getName());

	/**
	 * 
	 * @throws Exception
	 */
	public StudentController() throws Exception {
		students = new ArrayList<>();

		studentDbUtil = StudentDbUtil.getInstance();

	}

	/**
	 * 
	 * @return List<Student>
	 * @throws Exception
	 */
	public List<Student> getStudents() throws Exception {

		return students;
	}

	/**
	 * 
	 * @throws Exception
	 */
	public void loadStudents() throws Exception {
		logger.info("Loading Students");

		students.clear();

		try {
			// get all the students from database
			students = studentDbUtil.getStudents();

		} catch (Exception e) {
			logger.log(Level.SEVERE, "Error loading students", e);

			// add error message
			addErrorMessage(e);
		}

	}

	public String addStudents(Student student) throws Exception {
		logger.info("Adding A student");

		try {
			// Add student to database
			studentDbUtil.addStudent(student);
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Error addign student", e);
			addErrorMessage(e);
		}

		return "list-students?face-redirect";

	}

	/**
	 * 
	 * @param e
	 */
	private void addErrorMessage(Exception e) {

		FacesMessage message = new FacesMessage("error: " + e.getMessage());

		FacesContext.getCurrentInstance().addMessage(null, message);

	}

}
