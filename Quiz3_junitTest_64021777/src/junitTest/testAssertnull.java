package junitTest;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class testAssertnull {
	
	QuizOneJunit obj;
	
	@Before
	public void setUp() {
		obj = new QuizOneJunit();
	   }

	@Test
	public void testAssertnull1() {

		assertNull(obj.square(1));
	}
}
