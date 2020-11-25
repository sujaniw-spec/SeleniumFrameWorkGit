package missalanius;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Misselanius {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium-Rahul\\Selenium-ChromeDriverExe\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("sujani");
		//Test case
		//after deleting the session id, it should go back to login page after clicking the any link - verify login
		
		driver.get("https://google.com");
		
		driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).click();
		//driver.manage().deleteCookieNamed("sessionkey");
		

	}

}
