package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragDrop {
ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
	}
	
	@Test
	public void dragAndDrop()
	{	
		Actions act=new Actions(driver);
		
		WebElement src1=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement dest1=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		act.dragAndDrop(src1,dest1);
		act.perform();
		
		WebElement src2=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement dest2=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		act.dragAndDrop(src2,dest2);
		act.perform();
		
		WebElement src3=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement dest3=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		act.dragAndDrop(src3,dest3);
		act.perform();
		
		WebElement src4=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement dest4=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		act.dragAndDrop(src4,dest4);
		act.perform();	
	}
}
