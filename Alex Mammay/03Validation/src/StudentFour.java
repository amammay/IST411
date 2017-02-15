/**
 * 
 */
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.xml.bind.ValidationException;

/**
 * 
 */
@ManagedBean
/**
 * @author mammay
 *
 */
public class StudentFour 
{
	private String firstName, lastName, courseCode;

	//	validation in controller is server side validation

	public StudentFour()
	{
		
	}

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
	
	/**
	 * @return the courseCode
	 */
	public String getCourseCode() {
		return courseCode;
	}

	/**
	 * @param courseCode the courseCode to set
	 */
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	
	public void validateThecourseCode(FacesContext myContext, UIComponent myComponent, Object myValue) throws ValidatorException
	{
		
		
		if (myValue == null) 
		{
			return;
		}
		
		
		String tempData = myValue.toString();
		
		//course code must mach IST... if not throw exception
		if (!tempData.startsWith("IST"))
		{
			FacesMessage message = new FacesMessage("Course Code must start with IST");
			
			throw new ValidatorException(message);

			
		}
		
	
		
		
		
	}
	
	
	
}
