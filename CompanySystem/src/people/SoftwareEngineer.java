package people;

public class SoftwareEngineer extends Employee {
	protected int age;
	private int cOff;
	
	public SoftwareEngineer(String name, String id, int age , int yearJoined ) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.yearJoined = yearJoined;
		System.out.println("SoftwareEngineer : "+ name + " created.....");
	}
	

	public void setCOff(int coff){
		this.cOff = coff;
	}
	
	public int getCOff(){
		return cOff;
	}
	
	@Override
	public long getSalary() {
		long seSalary = super.getSalary() + 1300000;
		return seSalary;
	}
	
	@Override
	public long getBonus(){
		long bonus = super.getBonus() + 500000;
		return bonus;
	}
	
	@Override
	public long getTotalSalary() {
		long totalSalary = getSalary() + getBonus() - getDeductedSalary() ;
		return totalSalary;
	}
}
