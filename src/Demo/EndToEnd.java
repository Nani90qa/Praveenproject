package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EndToEnd {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayap\\Automation\\chromedriver_win32 new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[@class='text-label'][.='Flights']")).click();
		// Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Hotels']")).click();
		// Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Holiday Packages']")).click();
		// Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='text-label'][.='Flights']")).click();
		// Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		// Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_2']")).click();
		// Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='MultiCityModelAlert']")).click();
		// Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		// Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")).click();
		driver.findElement(By.xpath("//option[@value='AED']")).click();
		System.out.println(driver.findElement(By.xpath("//option[@value='AED']")).getText());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[@value='INR']")).click();
		System.out.println(driver.findElement(By.xpath("//option[@value='INR']")).getText());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();

		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
		for (int i = 0; i < 5; i++) {
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();

		}
		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());

		// driver.findElement(By.xpath("//span[@id='hrefIncChd']")).click();
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		for (int i = 0; i < 3; i++) {
			driver.findElement(By.xpath("//span[@id='hrefIncChd']")).click();
		}
		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
		for (int i = 0; i < 4; i++) {
			driver.findElement(By.xpath("//span[@id='hrefIncInf']")).click();
		}
		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind");
		driver.findElement(By.xpath("//ul[@id='ui-id-1']")).click();
		driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/button[@class='ui-datepicker-trigger']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-hover")).click();
		
	}
}
