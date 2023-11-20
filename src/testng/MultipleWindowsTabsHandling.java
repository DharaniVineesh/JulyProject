package testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleWindowsTabsHandling {
WebDriver d;
	
	@BeforeTest
	public void setup()
	{
		d=new ChromeDriver();
		//driver.get("https://demo.guru99.com/test/drag_drop.html");
		
	}
	@Test
	public void test()
	{
		d.get("https://demo.guru99.com/popup.php");
		String parentWindow=d.getWindowHandle();
		System.out.println("Parent Window Title " + d.getTitle());
		d.findElement(By.xpath("/html/body/p/a")).click();
		
		Set<String> allWindowHandles = d.getWindowHandles();
		
		for(String handle : allWindowHandles)
		{
			if(!handle.equalsIgnoreCase(parentWindow))
			{
				d.switchTo().window(handle);
				d.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("dhaaru123@gmail.com");
				d.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
				d.close();
			}
			d.switchTo().window(handle);
			
		}
		
	}
	

}
