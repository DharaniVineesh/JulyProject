package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPgm {
	
	ChromeDriver d;
	
	@Before
	public void setup()
	{
		d=new ChromeDriver();
		d.get("file:///C:/Users/dhaar/OneDrive/Desktop/alert.html");
	}
	
	@Test
	public void test1()
	{
		d.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=d.switchTo().alert();
		String alerttext=a.getText();
		System.out.println(alerttext);
		a.accept();
		//a.dismiss();
		d.findElement(By.xpath("/html/body/input[2]")).sendKeys("Dharani");
		d.findElement(By.xpath("/html/body/input[3]")).sendKeys("Balakrishnan");
		//d.findElement(By.xpath("/html/body/input[4]")).click();
		
	}

}
