package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TravelCalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayap\\Automation\\chromedriver_win32 new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companion/");
		driver.findElement(By.xpath(".//*[@id='travel_date']")).click();
		
		List <WebElement> dates= driver.findElements(By.className(".day"));
		int count= driver.findElements(By.className(".day")).size();
		
		for (int i=0;i<count;i++) {
		
			String text=driver.findElements(By.className(".day")).get(i).getText();

		if(text.equalsIgnoreCase("23"))
			{
			driver.findElements(By.className(".day")).get(i).click();
			break;
			}
			}

	}

}
