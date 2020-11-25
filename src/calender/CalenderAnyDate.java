package calender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderAnyDate {
	
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Selenium-Rahul\\Selenium-ChromeDriverExe\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.path2usa.com/travel-companions");
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	Thread.sleep(8000);
	driver.findElement(By.xpath("//input[@id='travel_date']")).click();
	driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='datepicker-switch']")).getText().contains("November");//to identify uniqley get the parent node too. get the year and month inthe top
	
	while(!driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='datepicker-switch']")).getText().contains("November")) {
		
		driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='next']")).click();
	}
		
		
	
	//grab the common attribute and put into the list
	List <WebElement> dates = driver.findElements(By.className("day"));
	
	
	for(WebElement day: dates) {
		
		if(day.getText().equals("10")){
			System.out.println(day.getText());
			day.click();
			break;
			
		}
		
		
	}
	
	//Thread.sleep(8000);
	//driver.findElement(By.className("sumome-react-svg-image-container")).click();

}

}
