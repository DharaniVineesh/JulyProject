package junit;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {
	ChromeDriver d;
	@Before
	public void setup()
	{
		d=new ChromeDriver();
		d.get("https://www.ebay.com");
	}
	
	@Test
	public void test1()
	{
		List<WebElement>li=d.findElements(By.tagName("a"));
		System.out.println("Total Links= " +li.size());
		
		for(WebElement element:li)
		{
			String link=element.getAttribute("href");
			String text=element.getText();
			System.out.println(link+"---"+text);
		}
		
	}

}
