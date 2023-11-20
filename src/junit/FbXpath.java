package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbXpath {

	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void fblogin()
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Dhaaru223@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Dhar123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
}
