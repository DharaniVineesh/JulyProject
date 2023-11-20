package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonEnabled {
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
		boolean button=d.findElement(By.xpath("//input[@class='btn_checkavail']")).isEnabled();
		if(button)
		{
			System.out.println("Button is Enabled");
		}
		else
		{
			System.out.println("Button is Disabled");
		}
	}
}
