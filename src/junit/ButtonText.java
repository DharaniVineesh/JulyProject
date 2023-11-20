package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonText {
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
		String button=d.findElement(By.xpath("//*[@id='Register']")).getAttribute("value");
		System.out.println(button);
		
		if(button.equals("Create my account >>"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
