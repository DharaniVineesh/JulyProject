package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FbcreatePage {


	WebDriver d;
	
	By createpage=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	
	By getstarted=By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button/div/div");
	
	public FbcreatePage(WebDriver d)
	{
		this.d=d; 
	}
	 public void pageclick()
	 {
		 d.findElement(createpage).click();
	 }
	 
	 public void getstartedbutton()
	 {
		 d.findElement(getstarted).click();
	 }
}
