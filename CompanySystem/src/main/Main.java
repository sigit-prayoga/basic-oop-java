package main;
import people.QAEngineer;
import invetories.Laptop;


public class Main {

	public static void main(String[] args) {
		Laptop asus = new Laptop("Asus", 5000000);
		
		boolean isRunning = asus.runApplication("Microsoft Word");
		System.out.println("Is the app running? "+isRunning);
		
		isRunning =  asus.runApplication("photoshop");
		System.out.println("Is the app running? "+isRunning);
		
		System.out.println("The laptop's name is  "+asus.getName()+", it costs around "+asus.getPrice());
		
		QAEngineer raka = new QAEngineer("Raka", "007", 13);
		System.out.println("The new hire of QA is "+raka.getName());
	}
}
