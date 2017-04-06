import javax.faces.bean.ManagedBean;

@ManagedBean
/**
 * @author mammay
 *
 */

public class Student {

	private String firstName, lastName, email;
	private int id;

	/**
	 * 
	 */
	public Student() {

	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param id
	 */
	public Student(String firstName, String lastName, String email, int id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.id = id;
	}

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
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", id=" + id + "]";
	}

}
