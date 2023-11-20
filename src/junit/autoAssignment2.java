package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoAssignment2 {
ChromeDriver d;
	
	@Before
	public void setup()
	{
		d=new ChromeDriver();
		d.get("https://automationexercise.com/");
		d.manage().window().maximize();
	}
	
	@Test
	public void test1() throws Exception
	{
		d.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id='accordian']/div/div/h4/a")).click();
		d.findElement(By.xpath("//*[@id=\"Women\"]/div/ul/li[1]/a")).click(); 
		d.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/div[2]/div/div[2]/ul/li/a")).click();
		Thread.sleep(3000);
		//d.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")).click();
		//d.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button")).click();
		d.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Dharani");
		d.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("dhaaru123@gmail.com");
		d.findElement(By.xpath("//*[@id=\"review\"]")).sendKeys("Good Product");
		d.findElement(By.xpath("//*[@id=\"button-review\"]")).click();
	}
}
