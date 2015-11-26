package people;

public class Employee {
	protected String name;
	protected String id;
	protected int yearJoined;
	protected int totalAbsence;
	
	public Employee(String name, String id){
		this.name = name;
		this.id = id;
	}
	/**
	 * @return UMR Jakarta
	 */
	protected long getSalary() {
		long standard = 2700000;
		return standard;
	}
	
	public String getName(){
		return name;
	}
	
	public int getTotalAbsence() {
		return totalAbsence;
	}
	
	public void setTotalAbsence(int totalAbsence) {
		this.totalAbsence = totalAbsence;
	}
}
