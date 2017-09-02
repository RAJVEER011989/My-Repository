package ATTEST;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	
	@Parameters({"First Value"})
	@Test
	public void testOne(String FirstName)
	{
		System.out.println(FirstName);
	}
	@Parameters({"Last Value"})
	@Test
	public void testTwo(String LastName)
	{
		System.out.println(LastName);
	}
	
	@Parameters({"First Value","Last Value1"})
	@Test
	public void testThree(String FirstName, String LastName)
	{
		System.out.println(LastName + " " + FirstName);
	}
}
