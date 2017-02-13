import javax.faces.bean.ManagedBean;



/**
 * 
 */
@ManagedBean
/**
 * @author mammay
 *
 */
public class StudentTwo 
{
	
	private String firstName;
	private String lastName;
	private int freePasses;
	private int postalCode;
	
	
	
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
	 * @return the freePasses
	 */
	public int getFreePasses() {
		return freePasses;
	}



	/**
	 * @param freePasses the freePasses to set
	 */
	public void setFreePasses(int freePasses) {
		this.freePasses = freePasses;
	}







	/**
	 * @return the postalCode
	 */
	public int getPostalCode() {
		return postalCode;
	}



	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}



	public StudentTwo()
	{
	
		
		
	}


	
	


}
