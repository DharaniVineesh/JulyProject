package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class PageSource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String page=driver.getPageSource();
		if(page.contains("Gmail"))
		{
			System.out.println("Gmail text is present");
		}
		else
		{
			System.out.println("Gmail text is not present");
		}
		

	}

}
