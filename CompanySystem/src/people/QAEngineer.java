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
}
