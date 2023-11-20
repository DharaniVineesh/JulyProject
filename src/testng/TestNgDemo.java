package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgDemo {
	@BeforeTest
	public void setup()
	{
		System.out.println("Before test");
	}
	
	@BeforeMethod
	public void mthd()
	{
		System.out.println("Before method");	
	}
	
	@Parameters ("s")
	@Test(groups = {"smoke"})
	public void dd(String s)
	{
		System.out.println("Test 1");
		System.out.println(s);
	}
	
	@Test(groups = {"sanity"})
	public void aa()
	{
		System.out.println("Test 2");
	}
	
	@Test(groups = {"sanity"})
	public void cc()
	{
		System.out.println("Test 3");
	}
	
	@Test(groups = {"smoke"})
	public void ee()
	{
		System.out.println("Test 4");
	}
	
	@AfterMethod
	public void aftr()
	{
		System.out.println("After Method");
	}
	
	@AfterTest
	public void close()
	{
		System.out.println("Quit");
	}
	
}
