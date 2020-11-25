package tabel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium-Rahul\\Selenium-ChromeDriverExe\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		WebElement table = driver.findElement(By.id("product"));
		
		
		int rowCount   = table.findElements(By.tagName("tr")).size();
		WebElement row = table.findElements(By.tagName("tr")).get(2);
		int columnCount  = row.findElements(By.tagName("td")).size();
		
		System.out.println("Row Count = "+rowCount);
		System.out.println("Columns Count = "+columnCount);
		
		List <WebElement> rowSecond = row.findElements(By.tagName("td"));
		
		String columnData="";
		for(WebElement column : rowSecond) {
			columnData = columnData+column.getText();
			
		}
		
		System.out.println(columnData.trim());
	}

}
