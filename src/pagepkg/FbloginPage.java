package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FbloginPage 
{
	WebDriver d;
	
	By fbemail=By.id("email");
	By fbpswd=By.id("pass");
	By fblogin=By.name("login");
	
	public FbloginPage(WebDriver d)
	{
		this.d=d;
	}

public void setvalues(String email,String pswd)
{
	d.findElement(fbemail).sendKeys(email);
	d.findElement(fbpswd).sendKeys(pswd);
}

public void login()
{
	d.findElement(fblogin).click();
}
}