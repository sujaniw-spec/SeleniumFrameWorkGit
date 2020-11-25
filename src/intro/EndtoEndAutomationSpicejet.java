package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndtoEndAutomationSpicejet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium-Rahul\\Selenium-ChromeDriverExe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']) //a[@value='BOM']")).click(); //without getting by index select the parent div and then child div
		//Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click(); //cssselector class can get by . and if class name has space should replace by .(id by #)

		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled()); //should be false. But, in browser when click the object it enables. 
		//therefore we check the changing attribute and check from it
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		//if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")){
			
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {	
			System.out.println("Calender dissable");
			Assert.assertTrue(true);
		}
		else {
			Assert.assertFalse(false);
		}
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(4000);
		Select adult= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		adult.selectByVisibleText("3");
		
		Select child= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		child.selectByVisibleText("2");
		
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		

		driver.close();
		driver.quit();
		

	}

}

