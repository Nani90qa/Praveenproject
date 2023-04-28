package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender
{
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayap\\Automation\\chromedriver_win32 new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		//.ui-state-default.ui-state-highlight
		 
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).isEnabled());
		//driver.findElement(By.cssSelector(".ui-state-default.ui-state-hover")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-hover")).click();
	}

}
