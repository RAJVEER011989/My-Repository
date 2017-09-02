package ATTEST;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {
	@Test(dataProvider = "data-provider")
	public void testmethod(String x)
	{
		System.out.println(x);
	}
	
	@DataProvider(name = "data-provider")
	public Object[][] dataProviderMethod()
	{
		return new Object[][]
				{
				
			{"Rajveer"},
			{"Vinit"}
				};
	}

}
