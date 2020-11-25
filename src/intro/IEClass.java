package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.ie.driver", "C:\\Selenium-Rahul\\IE-Driver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.google.com");
		
		System.out.println(driver.getTitle());
		
		//To check URL what we need
		System.out.println(driver.getCurrentUrl());
		

	}

}
