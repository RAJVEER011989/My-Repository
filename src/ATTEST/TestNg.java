package ATTEST;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TestNg {
	
	@BeforeClass
	
	public void beforeclass()
	
	{
		
		System.out.println("Initialize Selenium");
	}
	
	@BeforeMethod
	  
	public void openingBrowser() 
	{
		  System.out.println("Opening browser");
	  }
	
	@Test
	 
	  public void test1()
	{
		
		  System.out.println("test1");
		  
		  test t = new test();
		  
	  }
	  
	  @Test
	  
	  public void test2() {
		
		  System.out.println("test2");
	  }
 

  @AfterMethod
 
  public void closeBrowser() 
  
  {
	  System.out.println("Closing Browser");


  }
  
  @AfterClass
	
	public void afterclass()
	
	{
		
		System.out.println("Destroy Selenium");
	}
  
  
}


