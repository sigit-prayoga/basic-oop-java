import people.QAEngineer;

public class Main {

	public static void main(String[] args) {
		QAEngineer mark = new QAEngineer("Mark", "ID1", 32);
		mark.setTotalAbsence(3);
		
		QAEngineer brian = new QAEngineer("Brian", "ID3", 38);
		
		brian.setTotalAbsence(10);
		
		System.out.println(mark.getTotalSalary());
		System.out.println(brian.getTotalSalary());
	}
}
