package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String actualtitle=driver.getTitle();
		String exp="google";
		
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

