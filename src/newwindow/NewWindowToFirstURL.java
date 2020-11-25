package newwindow;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowToFirstURL {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
					
	System.setProperty("webdriver.chrome.driver","C:\\Selenium-Rahul\\Selenium-ChromeDriverExe\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/angularpractice/");
	
	//get the new tab to open the other url
	driver.switchTo().newWindow(WindowType.TAB);
	//get the new tab to open the other url
	//driver.switchTo().newWindow(WindowType.WINDOW);
		
	//get the window id
	Set <String> windowIds = driver.getWindowHandles();
	Iterator <String> iterator = windowIds.iterator();	
	
	String parentId = iterator.next();
	String childId =  iterator.next();
	
	driver.switchTo().window(childId);
	driver.get("https://rahulshettyacademy.com/#/index");
	//String CourseTitle = driver.findElement(By.xpath("//a[text()='Core java for Automation Testers + Interview Programs']")).getText();
	//get the first course availabe
	Thread.sleep(3000);
	String CourseTitle = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
	driver.switchTo().window(parentId);
	driver.findElement(By.name("name")).sendKeys(CourseTitle);
	//driver.quit();
	
	
	}

}
