import javax.faces.bean.ManagedBean;

import java.util.ArrayList;
import java.util.List;


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

	private String firstName;
	private String lastName;
	private String[] favoriteLanguages;
	
	
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
	 * @return the favoriteLanguages
	 */
	public String[] getFavoriteLanguages() {
		return favoriteLanguages;
	}


	/**
	 * @param favoriteLanguages the favoriteLanguages to set
	 */
	public void setFavoriteLanguages(String[] favoriteLanguages) {
		this.favoriteLanguages = favoriteLanguages;
	}
	
	
	
}
