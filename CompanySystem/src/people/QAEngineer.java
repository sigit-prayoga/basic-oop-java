package people;

public class QAEngineer extends Employee {
	
	public int age;
	
	/**
	 * Custom Constructor to create QAEngineer object.
	 * @param name its employees'name and it should be string
	 * @param id its employees'id and it should be string
	 * @param age its employees'age and it should be int
	 */
	public QAEngineer(String name, String id, int age) {
		super(name, id);
		this.age = age;
	}
	
	@Override
	public long getSalary() {
		long qaSalary = super.getSalary() + 1000000;
		return qaSalary;
	}
	
	@Override
	public long getTotalSalary() {
		long withBonus = super.getTotalSalary() + 500000;
		return withBonus;
	}
}
