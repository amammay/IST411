
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


/**
 * 
 */
@ManagedBean
@RequestScoped
/**
 * @author mammay
 *
 */
public class CounterThree {

	
	private int value = 0;
	
	
	
	/*
	 * 
	 */
	public CounterThree()
	{
		
	}
	
	
	public String increment()
	{
		
		value++;
		
		return "counter_three";

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
