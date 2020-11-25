package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBoxAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium-Rahul\\Selenium-ChromeDriverExe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		int checkBoxCount = driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		System.out.println(checkBoxCount);
		
		//driver.findElement(By.id("checkBoxOption1")).clear();
		Thread.sleep(4000);
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		
		
		

	}

}
