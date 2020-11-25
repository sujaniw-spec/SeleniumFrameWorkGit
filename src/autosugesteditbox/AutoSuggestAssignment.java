package autosugesteditbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium-Rahul\\Selenium-ChromeDriverExe\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		WebElement inputCountry = driver.findElement(By.cssSelector("#autocomplete"));
		inputCountry.click();
		inputCountry.sendKeys("IND");
		Thread.sleep(2000);
		for(int i=1; i<3; i++) {
		inputCountry.sendKeys(Keys.ARROW_DOWN);
		}
		inputCountry.sendKeys(Keys.ENTER);
		
		

	}

}
