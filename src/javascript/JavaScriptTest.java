package javascript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();

		//options.addArguments("--disable-notifications");
		
		
		options.addArguments("--disable-popup-blocking");

		System.setProperty("webdriver.chrome.driver","C:\\Selenium-Rahul\\Selenium-ChromeDriverExe\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://www.ksrtc.in");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		//String JS_DISABLE_UNLOAD_DIALOG = "Object.defineProperty(BeforeUnloadEvent.prototype, 'returnValue', { get:function(){}, set:function(){} });";

				//((JavascriptExecutor)driver).executeScript(JS_DISABLE_UNLOAD_DIALOG);

				//driver.quit();


		
		//Thread.sleep(2000);
	    driver.findElement(By.cssSelector("#fromPlaceName")).sendKeys("BENG");
	    driver.findElement(By.cssSelector("#fromPlaceName")).sendKeys(Keys.DOWN);
	    driver.findElement(By.cssSelector("#fromPlaceName")).sendKeys(Keys.ENTER);
	    System.out.println(driver.findElement(By.cssSelector("#fromPlaceName")).getText());
	   				//------------------------JavaScript---------------------------------------------
				
				// JavaScrip DOM can identify hidden elements
				//Because Selenium cannot identify hidden elements
				// Investigate the properties of object if it have any hidden text
				
				//JavaScripExecutor
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				
				String fromPlaceValue = "return document.getElementById('fromPlaceName').value;";
				//document.getElementById("fromCity").value
				String fromText = (String) executor.executeScript(fromPlaceValue);
				System.out.println(fromText);
				int i=0;
				while(!(fromText.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT"))) {
					i++;
					driver.findElement(By.cssSelector("#fromPlaceName")).sendKeys(Keys.DOWN);
					fromText = (String) executor.executeScript(fromPlaceValue);
					System.out.println(fromText);
					if(i>10) {
						
						break;}
				}
				
				if(i>10) {
					System.out.println("Element not found");
				}
				else {System.out.println("Element not found");}
				
				
				//BENGALURU INTERNATION AIRPORT
				
				//String li = (String)executor.executeScript(ul);
				//System.out.println(li);
				
				
	}

}
