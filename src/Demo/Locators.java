package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayap\\Automation\\chromedriver_win32 new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("Rahul");
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("Shetty");
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Praveen");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("prvnlk7@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("prvn@678");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9898986893");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		System.out.println(driver.findElement(By.xpath("//p[@class='infoMsg']")).getText());
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("rahul");
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("rahulshettyacademy");
		Thread.sleep(2000);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		//driver.close();

	}

}
