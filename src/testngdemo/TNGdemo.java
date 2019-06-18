package testngdemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.NoSuchElementException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TNGdemo {

	
	@Test (priority=1,enabled=true,dependsOnMethods= {"test2"}) //a value starts with @ is called annottations
	public void test()
	{
		System.out.println("TestNG demo test1 program");
	}
	
	@BeforeMethod
	public void BM()
	{
		System.out.println("Before method program");
		
	}

	@AfterMethod

	public void AM()
	{
		System.out.println("After method program");
	
	}

	@BeforeClass
	public void BC()
	{
		System.out.println("Before class program");
		
	}
		
	@AfterClass
	public void AC()
	{
		System.out.println("After class program");
		
	}
	
	@Test(priority=0,invocationCount=2,expectedExceptions=NoSuchElementException.class)
	
	public void test2()
	{
		System.out.println("TestNG demo test2 program");
		
	}
}
