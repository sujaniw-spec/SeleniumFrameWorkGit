package calender;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderEg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium-Rahul\\Selenium-ChromeDriverExe\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		//grab the common attribute and put into the list
		List <WebElement> dates = driver.findElements(By.className("day"));
		
		
		for(WebElement day: dates) {
			
			if(day.getText().equals("29")){
				System.out.println(day.getText());
				day.click();
				break;
				
			}
			
			
		}
		
		//Thread.sleep(8000);
		//driver.findElement(By.className("sumome-react-svg-image-container")).click();

	}

}
