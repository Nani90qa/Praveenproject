package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecommerce {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayap\\Automation\\chromedriver_win32 new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		List<WebElement> products=driver.findElements(By.xpath("//div[3]//div[3]//button[1]"));
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/a[2]")).click();
		for (int i=0;i<products.size();i++) {
			String name=products.get(i).getText();
			
			if(name.contains("Cucumber"))
			{
				driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/a[2]")).get(i).click();
				break;
				
			}
		}
		
		
	}

}
