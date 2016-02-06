package main;
import invetories.Iphone;
import invetories.Laptop;
import invetories.SamsungGalaxy;
import people.Employee;
import people.QAEngineer;
import people.SoftwareEngineer;


public class Main {

	public static void main(String[] args) {
		
		createDevTeam();
		
	}
	
	public static void createDevTeam(){
		SoftwareEngineer se = new SoftwareEngineer("John", "01");
		QAEngineer qa = new QAEngineer("Lisa", "02", 30);
		Employee pm = new Employee("David", "03");
		
	}
	
	public static void createCusterServiceRep(){
		Iphone iphone = new Iphone();
		SamsungGalaxy samsung = new SamsungGalaxy();
		
		QAEngineer brian = new QAEngineer("Mark", "ID1", 32);
		brian.callCustomer(iphone, "1", samsung);
	}
	
	public static void buildLaptop(){
		Laptop asus = new Laptop("Asus", 5000000);
		asus.getName();
		asus.getPrice();
		
		boolean isRunning = asus.runApplication("Microsoft Word");
		System.out.println("Is the app running? "+isRunning);
		
		isRunning =  asus.runApplication("photoshop");
		System.out.println("Is the app running? "+isRunning);
	}
}
