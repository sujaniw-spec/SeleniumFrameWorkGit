package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium-Rahul\\Selenium-ChromeDriverExe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		
		//Validate if the title is correct
		System.out.println(driver.getTitle());
		
		//Validate if you are landed on correct URL
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.name("username")).sendKeys("hello");
		driver.findElement(By.name("pw")).sendKeys("sujani123");
		//driver.findElement(By.className("input r4 wide mb16 mt8 password")).click(); //Compound class names not permitted
		
		driver.findElement(By.xpath("//*[@id='[contains(text(),'15')Login']")).click();
		//System.out.println(driver.getPageSource());
		String errorMsg = driver.findElement(By.cssSelector("#error")).getText();
		System.out.println(errorMsg);
		
		//div.ui-datepicker.ui-widget.ui-widget-content.ui-helper-clearfix.ui-corner-all.ui-datepicker-multi-2.ui-datepicker-multi:nth-child(7) div.ui-datepicker-group.ui-datepicker-group-first:nth-child(1) table.ui-datepicker-calendar tbody:nth-child(2) tr:nth-child(3) td:nth-child(3) > a.ui-state-default
		
		//div[@class='ui-datepicker-group ui-datepicker-group-first']//a[@class='ui-state-default']]
		
		driver.close(); // close the current browser
		driver.quit(); //close all the browsers open by selenium.
		

	}

}
