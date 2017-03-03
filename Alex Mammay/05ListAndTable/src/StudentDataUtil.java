import java.util.List;
import java.util.ArrayList;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 * 
 */
@ManagedBean
@ApplicationScoped
/**
 * @author mammay
 *
 */
public class StudentDataUtil
{

	private List<Student> students;
	


	public StudentDataUtil()
	{
		loadSampleData();
	}


	
	/*
	 * 
	 */
	private void loadSampleData() 
	{
		
		students = new ArrayList<>();
		
		students.add(new Student("Griffen", "Tom", "amm7100@psu.edu"));
		students.add(new Student("Jon", "Ron", "jon1222@psu.edu"));
		students.add(new Student("Doe", "Loe", "jon1244@psu.edu"));
		students.add(new Student("Shark", "Nark", "tom1222@psu.edu"));
		students.add(new Student("Tom", "Ocean", "der1020@psu.edu"));
		
		
	}
	
	
	/**
	 * @return the students
	 */
	public List<Student> getStudents() {
		return students;
	}


	/**
	 * @param students the students to set
	 */
	public void setStudents(List<Student> students) {
		this.students = students;
	}


	
	
	
	
	
}
