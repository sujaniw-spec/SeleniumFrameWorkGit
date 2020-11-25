package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium-Rahul\\GeckoDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("abc");
		driver.findElement(By.cssSelector("input[class='input r4 wide mb16 mt8 password']")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		//inputgroup

		
	}

}
