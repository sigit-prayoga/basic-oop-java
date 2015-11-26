package invetories;

public class Laptop {
	
	private String name;
	private long price;
	private Harddisk hd;
	
	/**
	 * Construct new laptop instance by passing its name and price
	 * @param newName
	 * @param newPrice
	 */
	public Laptop(String newName, long newPrice) {
		//construct the laptop
		name = newName;
		price = newPrice;
	}
	
	/**
	 * @return name, the name of the laptop
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * 
	 * @return price, return its price
	 */
	public long getPrice() {
		return price;
	}
	
	/**
	 * To run any application in the laptop by passing the name of the app
	 * @param appName, any app name will not be run if it's not "microsoft word"
	 * @return true, if its name is microsoft word. Otherwise, return false.
	 */
	public boolean runApplication(String appName){
		//if appName is not equal null. return true
		if (appName.equalsIgnoreCase("microsoft word")){
			return true;
		}else{
			return false;
		}
	}
}
