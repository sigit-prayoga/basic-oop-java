package tests;

import org.junit.Assert;
import org.junit.Test;

import people.Employee;

public class EmployeeTest {

	@Test
	public void testDeductedSalary() {
		Employee e = createMockEmployee();
		long deductedSalary = e.getDeductedSalary();
		
		Assert.assertTrue(deductedSalary == 0);
		
		e.setTotalAbsence(1);
		deductedSalary = e.getDeductedSalary();
		
		Assert.assertTrue(deductedSalary != 0);
		Assert.assertEquals(135000, deductedSalary);
	}
	
	@Test
	public void testTotalSalary(){
		Employee e = createMockEmployee();
		
		e.setTotalAbsence(10);
		long salary = e.getTotalSalary();
		
		Assert.assertFalse(salary == 0);
		Assert.assertTrue(salary == 1350000);
		
		e.setTotalAbsence(0);
		salary = e.getTotalSalary();
		
		Assert.assertTrue(salary == 2700000);
		
	}
	
	private Employee createMockEmployee(){
		Employee e = new Employee("Julie", "1");
		e.setTotalAbsence(0);
		return e;
	}
}
