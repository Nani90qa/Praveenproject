package Demo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args) throws Exception, Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayap\\Automation\\chromedriver_win32 new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//BrokenURL
		//
		String url= driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
		
	HttpURLConnection co =(HttpURLConnection) new URL(url).openConnection();
	
	co.setRequestMethod("HEAD");
	co.connect();
	int respCode = co.getResponseCode();
	System.out.println(respCode);
	
		

	}

}
