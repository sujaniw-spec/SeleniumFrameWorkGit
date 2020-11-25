package actions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MultipleWindowAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium-Rahul\\Selenium-ChromeDriverExe\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
			
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
		//driver.switchTo().newWindow(WindowType.WINDOW);
		driver.switchTo().activeElement();
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
        
		Set <String> windowids= driver.getWindowHandles();
		Iterator <String> ids = windowids.iterator();
		
		String parentId = ids.next();
		String childId  = ids.next();
		
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		driver.switchTo().window(parentId);
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		//System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());
		
		
		
		

	}

}
