package ATTEST;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UseOfBeforeTest2 {
	@BeforeTest
	public void beforetestmethod2()
	{
	System.out.println("BeforeTestMethod2: Before Test must be executed before execution of any test tag");	
	}
	@Test
	public void testMethod2()
	{
		System.out.println("testMethod 2 is executing");
	}
}
