package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		String exp="Facebook – log in or sign up";
		if(actualtitle.equalsIgnoreCase(exp))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}

	}

}
