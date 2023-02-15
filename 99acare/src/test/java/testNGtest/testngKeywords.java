package testNGtest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testngKeywords {
	
	
	@BeforeClass
	public void beforeclass () 
	{
		System.out.println("@BeforeClass");
	}
	
	@BeforeMethod
	public void beforeMethod () 
	{
		System.out.println("@BeforeMethod");
	}
	/*1) priority= to change the execution sequence of  test method, Default  Execution based on 
	 alphabetical order
	default priority is zero,negative number is supported in priority.
	2) invocationCount = to Execute the test method multiple time ,to repeat the test method,
	 Default invocationCount is one
	3)dependsOnMethods= If there is multiple test and one test is depend on another method.
	if any method dependOn another two or more method so in that case it is mandatory to pass both the test cases 
	. if any one test case is getting fail at that time dependent method will get skip from execution .   
	4)enabled=false     This is used to disable the test method i.e don't execute method
	*/ 
	
	@Test     (priority=1, invocationCount=4, dependsOnMethods= {"testprakashrao"})                            
	public void testpranita () 
	{
		System.out.println("pranita");
	}
	
	@Test (priority=2) 
	public void testprakashrao () 
	{
		System.out.println("prakash");
		//Assert.fail();        // to fail the test method
	}
	@Test //(enabled=false)
	public void testwadkar () 
	{
		System.out.println("wadkar");
	}
	@Test 
	public void testsujay () 
	{
		System.out.println("sujay");
	}
	@AfterMethod
	public void afterMethod () 
	{
		System.out.println("@AfterMethod");
	}
	@AfterClass
	public void afterClass() 
	{
		System.out.println("@AfterClass");
	}
}
	


