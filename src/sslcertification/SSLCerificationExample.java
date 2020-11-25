package sslcertification;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLCerificationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		
		//desired capabilities
		//general chrome browser
		//This is correct too
		/*DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("something", true);
		 
		options.addArguments("disable-infobars");
		options.merge(capabilities);*/
		
		
				
		//for new selenium versions
		//desiredCapabilities for general profile settings.
		options.setAcceptInsecureCerts(true);
		options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium-Rahul\\Selenium-ChromeDriverExe\\chromedriver.exe");
		
		//set local browser settings
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://google.co.in");

		

	}

}
