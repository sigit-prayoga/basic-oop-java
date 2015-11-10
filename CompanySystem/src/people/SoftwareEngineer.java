package people;

public class SoftwareEngineer extends Employee {

	
	@Override
	protected long getSalary() {
		long seSalary = super.getSalary() + 1300000;
		return seSalary;
	}
	
}
