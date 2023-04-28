package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {
	public static void main(String[] args) {
		
		
		//count of links in the web page
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayap\\Automation\\chromedriver_win32 new\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//count of footer section
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());	
		
		//footer section 1st coloumn links
		WebElement colomndriver= footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(colomndriver.findElements(By.tagName("a")).size());
		
		//click on each link in the colomn  and chck if the pages are opening
		for(int i=1;i<colomndriver.findElements(By.tagName("a")).size();i++) {
			String clickonlinkstab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			colomndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkstab);			
		}

}
}
