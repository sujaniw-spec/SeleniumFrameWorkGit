package actions;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium-Rahul\\Selenium-ChromeDriverExe\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'Nested Frames')]")).click();
		
		List <WebElement> FrameList = driver.findElement(By.tagName("frameset")).findElements(By.tagName("frame"));
		int index=0;
		
		for(WebElement frame : FrameList) {
			
			driver.switchTo().frame(index);
			if(index==1) {
				
				System.out.println(driver.findElement(By.cssSelector("div[id='content']")).getText());
				break;
			}
			
			index++;
			
		}
		
	//driver.switchTo().frame(driver.findElement(By.xpath("html/frameset/frame[1]"))).switchTo().
		//frame(driver.findElement(By.name("frame-middle"))); - This way is correct too. No need the above
		
		//System.out.println(driver.findElement(By.cssSelector("div[id='content']")).getText());
	}

}
