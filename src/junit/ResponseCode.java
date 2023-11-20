package junit;

import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResponseCode {
	String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
	ChromeDriver d;
	@Before
	public void setup()
	{
		d=new ChromeDriver();
		d.get(baseurl);
	}
	@Test
	public void test() throws Exception
	{
		URL u= new URL(baseurl);
		HttpURLConnection con=(HttpURLConnection)u.openConnection();
		con.connect();
		System.out.println(con.getResponseCode());
		if(con.getResponseCode()==200)
		{
			System.out.println("Valid Url - " +baseurl);
		}
		else
		{
			System.out.println("InValid Url - " +baseurl);
		}
	}

}
