package ATTEST;

import org.testng.annotations.Test;

public class ExecutionTime {
	@Test(timeOut = 5000)
	public void testThisShouldFail()
	{
	while(true);

	}
	
	@Test(timeOut = 5000)
	public void testThisShouldPass() throws InterruptedException
	{
	Thread.sleep(4000);

	}
}
