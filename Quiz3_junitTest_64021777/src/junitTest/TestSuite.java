package junitTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({

	testAssertEquals.class,
	testAssertFalse.class,
	testAssertNotnull.class,
	testAssertnull.class,
	testAssertTrue.class
})
public class TestSuite {

}
