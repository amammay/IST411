import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

import org.primefaces.context.RequestContext;

@ManagedBean

/**
 * @author Alex Mammay
 * @date 5/4/2017
 */
public class BookingView {

	private String firstName, lastName, email;

	private Date departureDate, returningDate;

	private Date currentDate = new Date();
	
	

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
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
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the departureDate
	 */
	public Date getDepartureDate() {
		return departureDate;
	}

	/**
	 * @param departureDate
	 *            the departureDate to set
	 */
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	/**
	 * @return the returningDate
	 */
	public Date getReturningDate() {
		return returningDate;
	}

	/**
	 * @param returningDate
	 *            the returningDate to set
	 */
	public void setReturningDate(Date returningDate) {
		this.returningDate = returningDate;
	}

	/**
	 * @return the currentDate
	 */
	public Date getCurrentDate() {
		return currentDate;
	}


	/**
	 * @details Verify that the email is in valid format, if so throw a error
	 * @param myContext
	 * @param myComponent
	 * @param myValue
	 * @throws ValidatorException
	 */
	public void validateEmail(FacesContext myContext, UIComponent myComponent, Object myValue)
			throws ValidatorException {

		// double check we are not null
		if (myValue == null) {
			return;
		}

		// Create a temp email string so we dont have to cast all day
		String tempEmail = (String) myValue;

		// regex we are using for email validation
		String emailRegex = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";

		// create a new pattern object of our regex
		Pattern p = Pattern.compile(emailRegex);

		// create a matcher object and using our tempEmail address we created
		Matcher m = p.matcher(tempEmail);

		// if email doesnt match throw error
		if (!m.matches()) {
			throw new ValidatorException(new FacesMessage("Invalid email"));
		}

	}

}
