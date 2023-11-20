package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioSelectedverify {
ChromeDriver d;
	
	@Before
	public void setup()
	{
		d=new ChromeDriver();
		d.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void radiobuttonverify()
	{
		boolean button=d.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).isSelected();
		if(button)
		{
			System.out.println("Male RadioButton is Selected");
		}
		else
		{
			System.out.println("Male RadioButton is not Selected");
		}
	}
}

