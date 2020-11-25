package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium-Rahul\\Selenium-ChromeDriverExe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		
		//Validate if the title is correct
		System.out.println(driver.getTitle());
		
		//Validate if you are landed on correct URL
		System.out.println(driver.getCurrentUrl());
		//driver.findElement(By.id("email")).sendKeys("sujaniw");
		//driver.findElement(By.name("pass")).sendKeys("sujani123");
		//driver.findElement(By.xpath("//*[@id='email']")).sendKeys("hello");
		driver.findElement(By.cssSelector("#email")).sendKeys("hello123");
		
		driver.findElement(By.cssSelector("#pass")).sendKeys("hello123");
		
		//driver.findElement(By.linkText("Forgot account?")).click();
		
		//driver.findElement(By.xpath("//*[@id='u_0_a']/div[3]/a")).click();
		driver.findElement(By.cssSelector("._6ltj > a:nth-child(1)")).click();
		


		//System.out.println(driver.getPageSource());
		
		
		//driver.close(); // close the current browser
		//driver.quit(); //close all the browsers open by selenium.
		

	}

}
