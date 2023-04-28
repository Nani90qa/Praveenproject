package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayap\\Automation\\chromedriver_win32 new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Actions a = new Actions(driver);

		WebElement name = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		a.moveToElement(driver.findElement(By.xpath("//form[@id='nav-search-bar-form']"))).click().keyDown(Keys.SHIFT)
				.sendKeys("praveen").doubleClick().build().perform();
		a.moveToElement(name).build().perform();
		a.moveToElement(name).contextClick().build().perform();

	}

}
