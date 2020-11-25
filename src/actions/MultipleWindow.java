package actions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver","C:\\Selenium-Rahul\\Selenium-ChromeDriverExe\\chromedriver.exe");
		
		//WebDriver driver =new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium-Rahul\\GeckoDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
	
		driver.get("https://accounts.google.com/signup");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//wait.until(ExpectedConditions.numberOfWindowsToBe(2));

		
		//driver.findElement(By.xpath("//ul[@class='Bgzgmd' ] /li[1] ")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		//Thread.sleep(5000);
		//System.out.println(driver.getTitle());
		
		//get all window handlers ids
		Set <String> windowids= driver.getWindowHandles();
		//wait.until(ExpectedConditions.);
		Iterator <String> ids = windowids.iterator();
		
		String parentId = ids.next();
		String childId  = ids.next();
		//System.out.println("parentid "+parentId);
		System.out.println("childId "+childId);
		
		driver.switchTo().window(childId);
		wait.until(ExpectedConditions.titleContains("Google Account Help"));
        
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='q']")));
        System.out.println("after wait");
		driver.findElement(By.name("q")).sendKeys("Test");
		
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());
		
		
		

	}

}
