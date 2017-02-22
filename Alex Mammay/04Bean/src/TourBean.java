import javax.faces.bean.ManagedBean;

/**
 * 
 */
@ManagedBean
/**
 * @author mammay
 *
 */
public class TourBean {

	
	private String kindOfTour;
	
	
	public TourBean()
	{
		
	}
	
	
	public String startTheTour()
	{
		String tempTour = kindOfTour;
		
		String tourType = "";
		

		switch (tempTour) {
		case "city":
			tourType = "city_tour";
			break;
			
		case "country":
			tourType = "country_tour";
			break;
			
		case "museam":
			tourType = "museam";
			break;
			
		case "zoo":
			tourType = "zoo_tour";
			break;
			
		case "beach":
			tourType = "beach_tour";
			break;
			
		default:
			break;
		}
		
		
		
		
		return tourType;
		
		
		
		
	}


	/**
	 * @return the kindOfTour
	 */
	public String getKindOfTour() {
		return kindOfTour;
	}


	/**
	 * @param kindOfTour the kindOfTour to set
	 */
	public void setKindOfTour(String kindOfTour) {
		this.kindOfTour = kindOfTour;
	}
	
	
}
