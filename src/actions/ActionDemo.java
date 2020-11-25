package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium-Rahul\\Selenium-ChromeDriverExe\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
			
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		//move to specific element
		WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		
		action.moveToElement(move).build().perform();
		//capitalization and select the text
		action.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		//right click
		action.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).contextClick().build().perform();
		
		
		
	}

}
