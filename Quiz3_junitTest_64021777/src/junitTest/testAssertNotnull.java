package junitTest;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class testAssertNotnull {

	QuizOneJunit obj;
	
	@Before
	public void setUp() {
		obj = new QuizOneJunit();
	   }
	
	@Test
	public void testAssertNotnull1() {
		assertNotNull(obj.square(0));
		
	}
}
