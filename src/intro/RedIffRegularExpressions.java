package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedIffRegularExpressions {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium-Rahul\\Selenium-ChromeDriverExe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click(); // cssselector Regular expression
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("suajni");
		driver.findElement(By.cssSelector("input#password")).sendKeys("sujni"); // tagname#id
		driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click(); //regular expression xpath
		
		
		

	}

}
