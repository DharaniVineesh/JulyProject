package junit;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResCodeMultiplelinks 
	{
	ChromeDriver d;
	@Before
	public void setup()
	{
		d=new ChromeDriver();
		d.get("https://www.ebay.com");
	}
	
	@Test
	public void test()
	{
		List<WebElement>li=d.findElements(By.tagName("a"));
		System.out.println("Total Links= " +li.size());
		
		for(WebElement element:li)
		{
			String link=element.getAttribute("href");
			verifylink(link);
			
		}
	}

	private void verifylink(String link) 
	{
		try
		{
			URL u= new URL(link);
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			con.connect();
			if(con.getResponseCode()==200)
			{
				System.out.println("Response code is 200 - " +link);
			}
			else if(con.getResponseCode()==404)
			{
				System.out.println("Response code is 404 - " +link);
			}}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}

	



		
