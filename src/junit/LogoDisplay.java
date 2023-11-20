package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoDisplay {
ChromeDriver d;
	
	@Before
	public void setup()
	{
		d=new ChromeDriver();
		d.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void test1()
	{
		boolean logo=d.findElement(By.xpath("//img[@title='Rediff.com']")).isDisplayed();
		if(logo)
		{
			System.out.println("Logo is Displayed");
		}
		else
		{
			System.out.println("Logo is not Displayed");
		}
	}
}
