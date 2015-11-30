package main;
import invetories.Laptop;
import people.QAEngineer;
import people.SoftwareEngineer;


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
		
		SoftwareEngineer zen = new SoftwareEngineer("Zaenal", "001", 10, 2015, 4500000);
		System.out.println("Employee Name : " + zen.getName());
		System.out.println("Employee Age  : "+ zen.getAge());
		System.out.println("Basic Salary  : "+ zen.getSalary());
		zen.addNewBugs("OG1", 3);
		zen.addNewBugs("OG2", 5);
		zen.addNewBugs("OG4", 2);
		zen.addNewBugs("OG3", 1);
		System.out.println("Number Of bugsDone : "+ zen.getNumberOfBugs(zen.getList()));
		System.out.println("list Of Bugs : ");
		zen.listAllBugs(zen.getList());
		int score = zen.getTotalScore(zen.getList());
		System.out.println("Score total : " + score);
		System.out.println("Salary "+ zen.getName() + " : "+zen.getSalary(score));
        
        SoftwareEngineer dr = new SoftwareEngineer("Denny", "002", 22, 2015, 4300000);
		System.out.println("Employee Name : " + dr.getName());
		System.out.println("Employee Age  : "+ dr.getAge());
		System.out.println("Basic Salary  : "+ dr.getSalary());
		dr.addNewBugs("OG1", 3);
		dr.addNewBugs("OG2", 3);
		dr.addNewBugs("OG4", 3);
		dr.addNewBugs("OG3", 2);
		System.out.println("Number Of Bugs Done : "+ dr.getNumberOfBugs(dr.getList()));
		System.out.println("List Of Bugs : ");
		dr.listAllBugs(dr.getList());
		score = dr.getTotalScore(dr.getList());
		System.out.println("Score Total : " + score);
		System.out.println("Salary "+ dr.getName() + " : "+dr.getSalary(score));

		SoftwareEngineer faf = new SoftwareEngineer("Fhadel", "010", 21, 2015, 4000000);
		faf.addNewBugs("OG6",1);
		faf.addNewBugs("OG7",2);
		System.out.println("Employee Name :" + faf.getName());
		System.out.println("Basic Salary :" + faf.getSalary());
		System.out.println("List Bugs assign to Fhadel : " + faf.getNumberOfBugs(faf.getList()));
		int score1 = faf.getTotalScore(faf.getList());
		System.out.println(faf.getName() + "has fixed" + faf.getNumberOfBugs(faf.getList())+ ",Total score : " +score1);
		System.out.println("Total Salary for" +faf.getName()+ " : " +faf.getSalary(score));


		System.out.println("Total salary he got is" );
			
	}
}
