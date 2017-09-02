package ATTEST;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Assert1 {
	@Test
	 
	  public void test1() {
		String a = "Rajveer";
		String b = "Singh";
		
		  
		  //System.out.println("test2");
		  Assert.assertTrue(2>11,"Impossible");
		  System.out.println(a+" "+b);
		 
		  
	  }
	@Test (dependsOnMethods = {"test1"})
	  
	  public void test3() {
		
		  System.out.println("test3");
	  }

}
