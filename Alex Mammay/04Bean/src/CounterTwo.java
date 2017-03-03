import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 * 
 */
@ManagedBean
//shared between users
@ApplicationScoped
/**
 * @author mammay
 *
 */
public class CounterTwo {

	
	private int value = 0;
	
	
	
	/*
	 * 
	 */
	public CounterTwo()
	{
		
	}
	
	
	public String increment()
	{
		
		value++;
		
		return "counter_two";

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
