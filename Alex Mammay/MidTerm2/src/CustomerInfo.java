import java.util.Date;

import javax.faces.bean.ManagedBean;


@ManagedBean

/**
 * @author mammay
 *
 */
public class CustomerInfo {

	private String firstName, lastName, email, 
	creditCardNumber, creditCardCVV;

	private Date departureDate, returningDate;

	private int numberOfRooms, numberOfAdults, numberOfChildren;
	
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
	 * @return the creditCardNumber
	 */
	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	/**
	 * @param creditCardNumber
	 *            the creditCardNumber to set
	 */
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	/**
	 * @return the creditCardCVV
	 */
	public String getCreditCardCVV() {
		return creditCardCVV;
	}

	/**
	 * @param creditCardCVV the creditCardCVV to set
	 */
	public void setCreditCardCVV(String creditCardCVV) {
		this.creditCardCVV = creditCardCVV;
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
	 * @return the numbrOfRooms
	 */
	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	/**
	 * @param numbrOfRooms the numbrOfRooms to set
	 */
	public void setNumberOfRooms(int numbrOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	/**
	 * @return the numberOfAdults
	 */
	public int getNumberOfAdults() {
		return numberOfAdults;
	}

	/**
	 * @param numberOfAdults the numberOfAdults to set
	 */
	public void setNumberOfAdults(int numberOfAdults) {
		this.numberOfAdults = numberOfAdults;
	}

	/**
	 * @return the numberOfChildren
	 */
	public int getNumberOfChildren() {
		return numberOfChildren;
	}

	/**
	 * @param numberOfChildren the numberOfChildren to set
	 */
	public void setNumberOfChildren(int numberOfChildren) {
		this.numberOfChildren = numberOfChildren;
	}



}
