package people;

public class QAEngineer extends Employee {
	public int age;
	public int cOff;
	
	/**
	 * Custom Constructor to create QAEngineer object.
	 * @param name its employees'name and it should be string
	 * @param id its employees'id and it should be string
	 * @param age its employees'age and it should be int
	 */
	public QAEngineer(String name, String id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}
	
	/**
	 * Custom Constructor to create QAEngineer object.
	 * @param name its employees'name and it should be string
	 * @param id its employees'id and it should be string
	 * @param age its employees'age and it should be int
	 * @param yearJoined its how long employees' join company and it should be int
	 */
	public QAEngineer(String name, String id, int age , int yearJoined ) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.yearJoined = yearJoined;
		System.out.println("QAEngineer : "+ name + " created.....");
	}
	
	public void setCOff(int coff){
		this.cOff = coff;
	}
	
	public int getCOff(){
		return cOff;
	}
	
	
	
	@Override
	public long getSalary() {
		long qaSalary = super.getSalary() + 1000000;
		return qaSalary;
	}
	
	@Override
	public long getTotalSalary() {
		long withBonus = super.getTotalSalary() + 500000 ;
		return withBonus;
	}
	
	
	public long getTotalSalaryAndYearBonus(){
		long bonus = getTotalSalary() - getDeductedSalary() + getBonus();
		return bonus;	
	}
	
	@Override
	public int getAnnualLeave(){
		int annualLeave = super.getAnnualLeave() - getCOff();
		return annualLeave;	
	}
	
	@Override
	public long getBonus(){
		long bonus = super.getBonus() + 10000;
		return bonus;
	}
	
	
	
}
