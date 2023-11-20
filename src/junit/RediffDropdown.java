package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RediffDropdown {
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
	WebElement day=d.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select"));
	Select daydetails=new Select(day);
	daydetails.selectByVisibleText("01");
	
	WebElement month=d.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]"));
	Select monthdetails=new Select(month);
	monthdetails.selectByVisibleText("MAR");
	
	WebElement year=d.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]"));
	Select yeardetails=new Select(year);
	yeardetails.selectByVisibleText("2022");
	
}

}
