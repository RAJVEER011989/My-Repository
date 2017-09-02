package ATTEST;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelBrowser {
	
	@Test
	@Parameters({"Browser"})
	public void testOne(String browser) throws InterruptedException
	{
	  if(browser.equalsIgnoreCase("ff"))
	  {
		 
		  WebDriver driver=new FirefoxDriver();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.get("https://www.facebook.com/");
		  for(int i =0;i<=10;i++)
		  {
		  System.out.println(driver.getTitle());
			  //System.out.println("Facebook");
		  
		  Thread.sleep(1000);
		  }
		  
	  }
	}
	

	@Test
	@Parameters({"Browser"})
	public void testTwo(String browser) throws InterruptedException
	{
	  if(browser.equalsIgnoreCase("ff"))
	  {
		  WebDriver driver=new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.get("https://www.google.com/");
		  for(int i =0;i<=10;i++)
		  {
		  System.out.println(driver.getTitle());
			  //System.out.println("Google");
		  
		  Thread.sleep(1000);
		  }
		  
		  
	  }
	}
	}


