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
public class StudentTwo 
{
	
	private String firstName;
	private String lastName;
	private String country;
	
	//list of countries
	List<String> countryOptions;
	
	
	public StudentTwo()
	{
		
		//populate the list with countries
		countryOptions = new ArrayList<>();

		countryOptions.add("Brazil");
		countryOptions.add("Germany");
		countryOptions.add("France");
		countryOptions.add("Mexico");
		countryOptions.add("South Korea");
		countryOptions.add("United States");
		
		
		
	}



	public List<String> getCountryOptions() {
		return countryOptions;
	}



	public void setCountryOptions(List<String> countryOptions) {
		this.countryOptions = countryOptions;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}

	
	
	


}
