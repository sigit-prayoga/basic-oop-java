package invetories;

public class Laptop {
	
	private String name;
	private long price;
	private Harddisk hd;
	
	public Laptop(String newName, long newPrice) {
		//construct the laptop
		name = newName;
		price = newPrice;
	}
	
	public String getName(){
		return name;
	}
	
	public long getPrice() {
		return price;
	}
	
	public boolean runApplication(String appName){
		//if appName is not equal null. return true
		if (appName.equalsIgnoreCase("microsoft word")){
			return true;
		}else{
			return false;
		}
	}
}
