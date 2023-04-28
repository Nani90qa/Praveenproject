package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayap\\Automation\\chromedriver_win32 new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement>value = driver.findElements(By.cssSelector(".table-display td:nth-child(3)"));
		int sum = 0;
		for(int i=0;i<value.size();i++) {
			
			sum = sum + Integer.parseInt(value.get(i).getText());
		}
		System.out.println(sum);

	}

}
