package Demo;

import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Brokenlink2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayap\\Automation\\chromedriver_win32 new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links= driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		
		for(WebElement link : links)
		{
			String url = link.getAttribute("href");
			HttpURLConnection conn =(HttpURLConnection) new URL(url).openConnection();
			
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			System.out.println(respCode);
		
		if(respCode>400)
		{
			System.out.println("The link with The Text" +link.getText()+ " is broken with code" + respCode);
			Assert.assertTrue(false);
			}
		}
}
}