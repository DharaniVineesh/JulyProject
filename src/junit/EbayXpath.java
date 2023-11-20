package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayXpath {
		ChromeDriver driver;
			
			@Before
			public void setup()
			{
				driver=new ChromeDriver();
				driver.get("https://www.ebay.com/");
				
			}
			@Test
			public void search()
			{
				driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Mobiles");
				driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
				driver.findElement(By.xpath("//*[@class='carousel__list']/li[2]/div[1]/a[1]/div[1]")).click();
				driver.findElement(By.xpath("//*[@id=\"x-refine__group__0\"]/ul/li/ul/li[1]/a/span")).click();
		
			}
			@Test
			public void title()
			{
				String actualtitle=driver.getTitle();
				System.out.println(actualtitle);
				String exp="Electronics, Cars, Fashion, Collectibles & More | eBay";
			if(actualtitle.equals(exp))
			{
				System.out.println("Pass");
			}
			else
			{
				System.out.println("Fail");
			}
		
			}
}

