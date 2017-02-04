import javax.faces.bean.ManagedBean;

/**
 * 
 */

@ManagedBean

/**
 * @author Alex Mammay
 * @Date
 * @Purpose
 * @Title
 */


public class Student 
{

	private String firstName;
	private String lastName;

	//create a no-arg constructor
	public Student()
	{
		
	}

	
	//define getter/setter methods
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
}
