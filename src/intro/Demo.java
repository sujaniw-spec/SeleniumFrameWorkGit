package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create driver object for chrome browser
		
		//we will strictly implement methods of web driver
		
		//invoke .exe file first
		//C:\\Selenium-Rahul\\Selenium-ChromeDriverExe\\chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium-Rahul\\Selenium-ChromeDriverExe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		
		//Validate if the title is correct
		System.out.println(driver.getTitle());
		
		//Validate if you are landed on correct URL
		System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		driver.get("http://yahoo.com");
		driver.navigate().back(); // click the browser back button
		driver.navigate().forward();// click the forward button
		
		driver.close(); // close the current browser
		driver.quit(); //close all the browsers open by selenium.
		
				
		

	}

}
