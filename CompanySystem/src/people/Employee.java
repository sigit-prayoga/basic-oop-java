package people;

public class Employee {
	protected String name;
	protected String id;
	protected int yearJoined;
	protected int totalAbsence;
	
	/**
	 * TODO: 
	 * Tambahkan dengan input method (Scanner)	
	 * Tentukan bonus tergantung dengan yearJoined,
	 * Hitung c-off dengan Sisa Cuti,
	 * Tambahkan limit cuti 14 hari dengan menggunakan constant,
	 */
	
	/**
	 * @return UMR Jakarta
	 */
	protected long getSalary() {
		long standard = 2700000;
		return standard;
	}
	
	public int getTotalAbsence() {
		return totalAbsence;
	}
	
	public void setTotalAbsence(int totalAbsence) {
		this.totalAbsence = totalAbsence;
	}
	
	public long getDeductedSalary() {
		if (getTotalAbsence() == 0) {
			return 0;
		}
		long salaryPerDay = getSalary() / 25;
		return salaryPerDay * getTotalAbsence();
	}
	
	public long getTotalSalary() {
		long totalSalary = getSalary() - getDeductedSalary();
		return totalSalary;
	}
	
}
