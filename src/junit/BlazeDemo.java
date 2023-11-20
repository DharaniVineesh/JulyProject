package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlazeDemo {

	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://blazedemo.com/register");
		
	}
	@Test
	public void Blazeregister()
	{
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Dharani");
		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Accy");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dhar123@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("dhar123");
		driver.findElement(By.xpath("//input[@id='password-confirm']")).sendKeys("dhar123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
}
