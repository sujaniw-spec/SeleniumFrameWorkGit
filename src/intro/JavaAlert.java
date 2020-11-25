package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String textName = "Sujani";
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium-Rahul\\Selenium-ChromeDriverExe\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("name")).sendKeys(textName);
		driver.findElement(By.cssSelector("#alertbtn")).click();
		//Driver switch to alert mode
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		//driver.switchTo().defaultContent();
		//confirmation button
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();
		
		driver.close();
		driver.quit();


	}

}
