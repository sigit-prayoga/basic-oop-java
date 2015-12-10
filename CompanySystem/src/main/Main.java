package main;
import invetories.Iphone;
import invetories.Laptop;
import invetories.SamsungGalaxy;
import people.QAEngineer;


public class Main {

	public static void main(String[] args) {
		Laptop asus = new Laptop("Asus", 5000000);
		asus.getName();
		asus.getPrice();
		
		boolean isRunning = asus.runApplication("Microsoft Word");
		System.out.println("Is the app running? "+isRunning);
		
		isRunning =  asus.runApplication("photoshop");
		System.out.println("Is the app running? "+isRunning);
		
		Iphone iphone = new Iphone();
		SamsungGalaxy samsung = new SamsungGalaxy();
		
		QAEngineer brian = new QAEngineer("Mark", "ID1", 32);
		brian.callCustomer(iphone, "1", samsung);
	}
}
