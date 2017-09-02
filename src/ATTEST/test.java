package ATTEST;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class test {
	 
	@Test(groups = {"Sanity-Group"})
 
  public void test1() {
	
	  System.out.println("test1");
	  
	  //test t = new test();
	  //t.test2();
  }
  @Test(groups = {"Sanity-Group"})
public void test2(){
  
  System.out.println("test2");
  throw new SkipException("Facebook Functionality is not implemented");
  
  }
  @Test (groups = {"Regression-Group"})
  
  public void test3() {
	
	  System.out.println("test3");
  }
}
