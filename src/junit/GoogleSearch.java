package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test
	public void google()
	{
		driver.findElement(By.id("APjFqb")).sendKeys("Rocket images",Keys.ENTER);
		//driver.findElement(By.name("btnK")).click();
		
	}
	

}
