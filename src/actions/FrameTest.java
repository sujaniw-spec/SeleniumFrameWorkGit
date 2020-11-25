package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Selenium-Rahul\\Selenium-ChromeDriverExe\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//frame id start with 0 index
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		WebElement source = driver.findElement(By.cssSelector("div#draggable"));
		WebElement target = driver.findElement(By.cssSelector("div#droppable"));
		
		//drag the div and drop
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent(); // come to the default location
		
		
		
		
	}

}
