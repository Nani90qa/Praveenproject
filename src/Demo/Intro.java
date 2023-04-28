package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Intro {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayap\\Automation\\chromedriver_win32 new\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		 //driver.get("https://www.youtube.com/watch?v=-NkTTOBEexk");
		 
		 driver.get("https://rahulshettyacademy.com/");
		 driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
	
	}

}
