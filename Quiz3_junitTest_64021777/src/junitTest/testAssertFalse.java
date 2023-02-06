package junitTest;

import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

public class testAssertFalse {
	
	QuizOneJunit obj;
	
	@Before
	public void setUp() {
		obj = new QuizOneJunit();
	   }
	
	@Test()
	public void testAssertFalse1() {
		
		assertFalse(obj.checkTwoLetter("test"));
	}
}
