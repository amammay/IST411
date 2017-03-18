import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
@ManagedBean
/**
 * @author mammay
 *
 */
public class Validator {
	
	public Validator()
	{
		
	}

	/**
	 * 
	 * @param myContext
	 * @param myComponent
	 * @param myValue
	 * @throws ValidatorException
	 */
	public void validateCreditCard(FacesContext myContext, UIComponent myComponent, Object myValue)
			throws ValidatorException {
		// check to see if we are null
		if (myValue == null) {
			return;
		}

		// Verify credit card is a string
		String ccnum = (String) myValue;

		// Send the credit card to the validate method
		boolean validCard = validateCard(ccnum);

		// If credit card isnt valid throw an error
		if (validCard == false)
			throw new ValidatorException(new FacesMessage("Invalid credit card format"));

	}
	
	/**
	 * 
	 * @param myContext
	 * @param myComponent
	 * @param myValue
	 * @throws ValidatorException
	 */
	public void validateCVV(FacesContext myContext, UIComponent myComponent, Object myValue)
			throws ValidatorException {
		// check to see if we are null
		if (myValue == null) {
			return;
		}

		String ccVV = (String) myValue;
		
		boolean validCVV = validateCVV(ccVV);
		
		if (validCVV == false)
			throw new ValidatorException(new FacesMessage("cvv out of range"));

	}
	
	

	/**
	 * Validate a credit card, does it have 16 digits
	 * 
	 * @param ccnum
	 * @return bool
	 */
	private boolean validateCard(String ccnum) {
		if (ccnum.length() == 16) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * 
	 * @param ccnum
	 * @return
	 */
	private boolean validateCVV(String ccnum) {
		if (ccnum.length() == 3) {
			return true;
		} else {
			return false;
		}
	}
	
	
	

}
