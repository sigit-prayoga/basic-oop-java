package people;

import java.util.ArrayList;

import bugs.Bugs;

public class SoftwareEngineer extends Employee {
	ArrayList<Bugs> List = new ArrayList<Bugs>();
	Bugs listBugs;
	int age;
	int year;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}	
	
	public ArrayList<Bugs> getList() {
		return List;
	}

	public void setList(ArrayList<Bugs> list) {
		List = list;
	}

	public SoftwareEngineer(String name, String id) {
		super(name, id);
		//create many more things
		//1-100
	}
	
	public SoftwareEngineer(String name, String id, int age, int year) {
		this(name, id);
		this.age = age;
		this.year = year;
		//1-100
		//101-300
		//do something with age and year
	}
	
	public SoftwareEngineer(String name, String id, int age, int year, int salary) {
		this(name, id, age, year);
		this.age = age;
		this.year = year;
	}

	public void addNewBugs(String id_bugs, int priority){
		Bugs newBugs = new Bugs(id_bugs, priority);
		List.add(newBugs);
	}
	
	public int getNumberOfBugs(ArrayList<Bugs> list){
		return list.size();
	}
	
	public void listAllBugs(ArrayList<Bugs> list){
		for(int i = 0 ; i < list.size(); i ++){
			listBugs= list.get(i);
			System.out.println ("ID Bugs  : "+ listBugs.getId_Bugs() + " || "+ "Priority : "+ listBugs.getPriority());
		}
	}
	
	public int getTotalScore(ArrayList<Bugs> list){
		int totalScore = 0;
		for(int i = 0 ; i < list.size(); i ++){
			listBugs= list.get(i);
			totalScore = totalScore + listBugs.getScore(listBugs.getPriority());
		}
		return totalScore;
	}
	
	@Override
	public long getSalary() {
		long seSalary = super.getSalary() + 1300000;
		return seSalary;
	}
	

	public long getSalary(int totalScore) {
		long seSalary = getSalary() + (totalScore*10000) ;
		return seSalary;
	}
	
}
