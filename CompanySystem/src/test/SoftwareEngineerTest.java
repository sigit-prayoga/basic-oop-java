package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import people.SoftwareEngineer;

public class SoftwareEngineerTest {

	@Test
	public void testTotalScore() {
		SoftwareEngineer e = createObj();
		int score = e.getTotalScore(e.getList());
		Assert.assertTrue(score == 0);
		Assert.assertFalse(score == 1);
		
		e.addNewBugs("bugs02", 1);
		score = e.getTotalScore(e.getList());
		Assert.assertFalse(score == 1);
		Assert.assertTrue(score == 5);
		
		e.addNewBugs("bugs03", 2);
		score = e.getTotalScore(e.getList());
		Assert.assertFalse(score == 0);
		Assert.assertTrue(score == 9);
	}

	
	public SoftwareEngineer createObj(){
		SoftwareEngineer e = new  SoftwareEngineer("Zaki","ID005", 25, 2015);
		//e.addNewBugs("bugs01", 5);
		return e;	
	}
}
