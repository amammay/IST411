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
public class StudentThree 
{
	
	private String firstName;
	private String lastName;
	private String favoriteLanguage;

	
	
	public StudentThree()
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
	 * @return the favoriteLanguage
	 */
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}



	/**
	 * @param favoriteLanguage the favoriteLanguage to set
	 */
	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}



	
	
	


}
