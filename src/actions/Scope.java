package actions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Selenium-Rahul\\Selenium-ChromeDriverExe\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//count of the links of the tags
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//footer links
		WebElement footageDriver = driver.findElement(By.id("gf-BIG")); //limiting web driver scope
		System.out.println(footageDriver.findElements(By.tagName("a")).size());
		
		//first column in the footer
		WebElement columnDriver=footageDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")));
		int isize = columnDriver.findElements(By.tagName("a")).size();
		//click on each link and check links are open
		
		for(int i=1; i<isize; i++) { // open all the tabs
			
			String clickOnLink = Keys.chord(Keys.CONTROL,Keys.ENTER); // Cntrol click/enter to open a new tab.
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
			Thread.sleep(2000);
			
		}
		
		Set <String> windowSet = driver.getWindowHandles(); //4 tabs
		Iterator <String> iterator = windowSet.iterator();
		String title="";
		while(iterator.hasNext()) { // get the titles of allthe tabs
			
			title = driver.switchTo().window(iterator.next()).getTitle();
			System.out.println(title);
		}
		
	}

}
