package people;

public class QAEngineer extends Employee {

	public int age;
	private int numberBugsTested;
	private double percentBonus;

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

	public QAEngineer(String name, String id, int age, int yearJoined, int numberBugsTested) {
		this(name, id, age);
		this.yearJoined = yearJoined;
		this.numberBugsTested = numberBugsTested;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setYearJoined(int yearJoined) {
		this.yearJoined = yearJoined;
	}

	public int getYearJoined() {
		return yearJoined;
	}

	public void setTotalTestedBugs(int numberBugsTested){
		this.numberBugsTested = numberBugsTested;
	}

	public int getTotalTestedBugs(){
		return numberBugsTested;
	}

	public double getPercentBonus(){
		if(numberBugsTested > 10){
			this.percentBonus = 0.30;
		}else if(numberBugsTested == 10){
			this.percentBonus = 0.20;
		}else if(numberBugsTested >= 5){
			this.percentBonus = 0.15;
		}else if(numberBugsTested > 0){
			this.percentBonus = 0.05;
		}else{
			this.percentBonus = 0.00;
		}
		return percentBonus;
	}

	public long getBonus(){
		long bonus = 0;
		bonus = (long) (super.getSalary()*percentBonus);
		return bonus;
	}

	@Override
	public long getSalary() {
		long qaSalary = super.getSalary() + 1000000;
		return qaSalary;
	}

	@Override
	public long getTotalSalary(){
		long qaSalaryWithBonus = super.getTotalSalary() + this.getBonus();
		return qaSalaryWithBonus;
	}
}
