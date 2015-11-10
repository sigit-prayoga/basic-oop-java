package main;

import people.QAEngineer;
import people.SoftwareEngineer;

public class Main {

	public static void main(String[] args) {
		QAEngineer mark = new QAEngineer("Mark", "ID1", 32);
		mark.setTotalAbsence(3);
		
		QAEngineer brian = new QAEngineer("Brian", "ID3", 38);
		
		brian.setTotalAbsence(10);

		System.out.println(mark.getTotalSalary());
		System.out.println(brian.getTotalSalary());
		System.out.println();
		
		QAEngineer denny = new QAEngineer( "Denny" , "ID1",  22, 5 );
		denny.setTotalAbsence(3);
		denny.setCOff(3);		
		System.out.println("Total gaji Deni : " + denny.getTotalSalary());
		System.out.println("Besarnya Potong : " + denny.getDeductedSalary());
		System.out.println("Bonus : " + denny.getBonus());
		System.out.println("Total gaji Deni + bonus tahunan : " + denny.getTotalSalaryAndYearBonus());
		System.out.println("Sisa jata cuti Deni : " + denny.getAnnualLeave());
		System.out.println();
		
		SoftwareEngineer raka = new SoftwareEngineer("raka", "ID5", 25, 5);
		raka.setTotalAbsence(5);
		System.out.println("Gaji raka : " + raka.getSalary());
		System.out.println("Total gaji raka : " + raka.getTotalSalary());
		System.out.println("Besarnya Potong : " + raka.getDeductedSalary());
		System.out.println("Bonus : " + raka.getBonus());
		System.out.println("Sisa jata cuti raka : " + raka.getAnnualLeave());
	}
}
