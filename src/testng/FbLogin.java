package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FbLogin {
	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Parameters({"a","b"})
	@Test
	public void fblogin(String a,String b)
	{
		driver.findElement(By.id("email")).sendKeys(a);
		driver.findElement(By.name("pass")).sendKeys(b);
		driver.findElement(By.name("login")).click();
		
	}
}
