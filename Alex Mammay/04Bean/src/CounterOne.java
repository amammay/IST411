
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * 
 */
@ManagedBean
//Unique to the users session
@SessionScoped
/**
 * @author mammay
 *
 */
public class CounterOne {

	
	private int value = 0;

	
	public CounterOne()
	{







	}
	
	
	public String increment()
	{
		
		value++;
		
		return "counter_one";

	}


	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}


	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}


	
}
