package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.FbcreatePage;
import pagepkg.FbloginPage;

public class FbloginTest {
	WebDriver d;
	
	@BeforeTest
	public void setup()
	{
		d=new ChromeDriver();
		d.get("https://www.facebook.com");
	}
	
	@Test
	public void testlogin()
	{
		FbloginPage ob=new FbloginPage(d);
		
		ob.setvalues("dhaaru12@gmail.com","Dhaaru12");
		ob.login();
		
		d.navigate().back();
		
		FbcreatePage fc=new FbcreatePage(d);
		fc.pageclick();
		fc.getstartedbutton();
	}
}
