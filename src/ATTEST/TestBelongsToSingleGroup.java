package ATTEST;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestBelongsToSingleGroup {
	
	@Test(groups = {"Sanity-Group"})
	public void testOne()
	{
		System.out.println("This belongs to Sanity Group of test 1");
	}
	
	@Test(groups = {"Regression-Group"})
	public void testTwo()
	{
		System.out.println("This belongs to regression group");
	}
	
	@Test(groups = {"Sanity-Group"})
	public void testThree()
	{
		System.out.println("This belongs to sanity group of test3");
	}

}
