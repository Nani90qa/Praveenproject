package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaExecutor {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayap\\Automation\\chromedriver_win32 new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;		
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		
		jse.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		List <WebElement> values=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum = 0;   
		
		for(int i=0;i<values.size();i++) {
			 sum = sum + Integer.parseInt(values.get(i).getText());
		}
		System.out.println(sum);
	}
}
