package ATTEST;

import org.testng.annotations.Test;

public class ParallelExecution {
	
	@Test
	public void testOne() throws InterruptedException
	{
		for(int i =0; i<=9;i++)
		{
			System.out.println("Rajveer Singh");
			Thread.sleep(1000);
		}
	}
	
	@Test
	public void testTwo() throws InterruptedException
	{
		for(int i =0; i<=9;i++)
		{
			System.out.println("Vinit Chaudhary");
			Thread.sleep(1000);
		}
	}

}
