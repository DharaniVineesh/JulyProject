package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitDemo {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void test1()
	{
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
	}
	
	@Test
	public void test2()
	{
		String src=driver.getPageSource();
		
		if(src.contains("abc"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	}
	
	@After
	public void teardown()
	{
		
	}
	
	

}
