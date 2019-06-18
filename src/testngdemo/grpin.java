package testngdemo;


import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import org.testng.annotations.Parameters;

import org.testng.annotations.BeforeClass;
import java.util.NoSuchElementException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class grpin  {

	@BeforeSuite
	public void BS()
	{
		System.out.println("Before site program");
		
	}
	@BeforeClass
	public void BC()
	{
		System.out.println("Before class program");
		
	}
	
	
	@BeforeMethod
	public void BM()
	{
		System.out.println("Before method program");
		
	}

	
	
	@Test (groups= {"Regression","SIT"})
	public void test()
	{
		System.out.println("Grouping 1");
	}
	
	@Test(groups= {"SIT"})
	
	public void test2()
	{
		System.out.println("Grouping 2");
		
	}
	
	@Test(groups= {"Regression"})
	@Parameters("name")
	public void para(String name)
	{
		System.out.println("name is " +name);
	}
	
	@AfterMethod

	public void AM()
	{
		System.out.println("After method program");
	
	}
	@AfterClass
	public void AC()
	{
		System.out.println("After class program");
		
	}
	
	@AfterSuite
	public void AS()
	{
		System.out.println("After site program");
		
	}
}




