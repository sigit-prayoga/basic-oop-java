package main;
import invetories.Laptop;
import people.QAEngineer;


public class Main {

	public static void main(String[] args) {
		QAEngineer mark = new QAEngineer("Mark", "ID1", 32);
		mark.setTotalAbsence(3);
		
		QAEngineer brian = new QAEngineer("Brian", "ID3", 38);
		
		brian.setTotalAbsence(10);
		
		System.out.println(mark.getTotalSalary());
		System.out.println(brian.getTotalSalary());
		
		Laptop asus = new Laptop("Asus", 5000000);
		asus.getName();
		asus.getPrice();
		
		
		boolean isRunning = asus.runApplication("Microsoft Word");
		System.out.println("Is the app running? "+isRunning);
		
		
		isRunning =  asus.runApplication("photoshop");
		System.out.println("Is the app running? "+isRunning);
	}
}
