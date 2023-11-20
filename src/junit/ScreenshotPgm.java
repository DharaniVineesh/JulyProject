package junit;


import java.io.File;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotPgm {
	ChromeDriver d;

	@Before
	public void setup()
	{
		d=new ChromeDriver();
		d.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}

	@Test
	public void test1() throws Exception
	{
		File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("C:\\Users\\dhaar\\OneDrive\\Desktop\\rediff.png"));
		FileHandler.copy(src,new File("./Screenshot/rediff.png"));
		
		WebElement button=d.findElement(By.xpath("//input[@class='btn_checkavail']"));
		File src1=button.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1, new File("./Screenshot/button.png"));		
	}
}
