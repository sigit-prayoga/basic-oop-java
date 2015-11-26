package people;

public class SoftwareEngineer extends Employee {

	
	public SoftwareEngineer(String name, String id) {
		super(name, id);
		//create many more things
		//1-100
	}
	
	public SoftwareEngineer(String name, String id, int age, int year) {
		this(name, id);
		//1-100
		//101-300
		//do something with age and year
	}
	
	public SoftwareEngineer(String name, String id, int age, int year, int salary) {
		this(name, id, age, year);
	}

	@Override
	protected long getSalary() {
		long seSalary = super.getSalary() + 1300000;
		return seSalary;
	}
	
}
