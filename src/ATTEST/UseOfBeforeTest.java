package ATTEST;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UseOfBeforeTest {
	@BeforeTest
	public void beforetestmethod1()
	{
	System.out.println("BeforeTestMethod1: Before Test must be executed before execution of any test tag");	
	}
	@Test
	public void testMethod1()
	{
		System.out.println("testMethod 1 is executing");
	}

}
