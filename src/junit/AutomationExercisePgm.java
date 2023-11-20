package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationExercisePgm {
	ChromeDriver d;
	@Before
	public void setup()
	{
		d=new ChromeDriver();
		d.get("https://automationexercise.com/login");
	}
	
	@Test
	public void signup()
	{
		d.findElement(By.xpath("//input[@name='name']")).sendKeys("Dharani");
		d.findElement(By.xpath("//form[@action='/signup']/input[3]")).sendKeys("dhaaru2424@gmail.com");
		d.findElement(By.xpath("//form[@action='/signup']/button")).click();
	
		d.findElement(By.xpath("//*[@id=\"id_gender2\"]")).click();
		d.findElement(By.xpath("//input[@id='password']")).sendKeys("Dhaar123");
		
		WebElement day=d.findElement(By.xpath("//select[@id='days']"));
		Select daydetails=new Select(day);
		daydetails.selectByIndex(24);
		
		WebElement month=d.findElement(By.xpath("//select[@id=\"months\"]"));
		Select monthdetails=new Select(month);
		monthdetails.selectByVisibleText("January");
		
		WebElement year=d.findElement(By.xpath("//select[@id='years']"));
		Select yeardetails=new Select(year);
		yeardetails.selectByVisibleText("1995");
		
		d.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Dharani");
		d.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Balakrishnan");
		d.findElement(By.xpath("//input[@id='company']")).sendKeys("ABC");
		d.findElement(By.xpath("//input[@id='address1']")).sendKeys("asdas, sadah");
		d.findElement(By.xpath("//input[@id='address2']")).sendKeys("coimbatore");
		
		WebElement country=d.findElement(By.xpath("//select[@id='country']"));
		Select countrydetails=new Select(country);
		countrydetails.selectByVisibleText("Australia");
		
		d.findElement(By.xpath("//input[@id='state']")).sendKeys("xdr");
		d.findElement(By.xpath("//input[@id='city']")).sendKeys("abc");
		d.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("600024");
		d.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("9874561230");
		
		d.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		
	}


}
