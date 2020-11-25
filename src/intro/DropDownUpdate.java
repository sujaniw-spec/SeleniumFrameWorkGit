package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownUpdate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium-Rahul\\Selenium-ChromeDriverExe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[value='GAY']")).click();
		
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[contains(text(),'Mumbai (BOM)')]")).click();
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		
		//sSystem.out.println(driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-active']")).getText());
		
		driver.findElement(By.xpath("//a[@class='ui-state-default'][contains(text(),'15')]")).click();
		//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[contains(text(),'Kolkata (CCU)')]
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(4000);
		Select adult= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		adult.selectByVisibleText("3");
		
		Select child= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		child.selectByVisibleText("2");
		
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		
		

	}

}
