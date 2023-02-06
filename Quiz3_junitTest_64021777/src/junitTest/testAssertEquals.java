package junitTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class testAssertEquals {

//	• AssertEquals [2 point must use]
//	• AssertTrue [1.5 point must use]
//	• AssertFalse
	
	QuizOneJunit obj;
	
	@Before
	public void setUp() {
		obj = new QuizOneJunit();
	   }
	
	@Test
	public void testAssertEquals1() {
		assertEquals(15, obj.square(0));
	}
}
