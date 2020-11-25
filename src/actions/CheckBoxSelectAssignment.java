package actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBoxSelectAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String checkBoxValue="";
		System.setProperty("webdriver.chrome.driver","C:\\Selenium-Rahul\\Selenium-ChromeDriverExe\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		WebElement checkBox = driver.findElement(By.id("checkBoxOption2"));
		checkBox.click();
		
		if(checkBox.isSelected()) {
			checkBoxValue = checkBox.getAttribute("value");
		}
		//click any checkbox
		/*List <WebElement> listCheckBox = driver.findElements(By.cssSelector("input[type='checkbox']"));
		Thread.sleep(3000);
		
		for(WebElement element : listCheckBox) {
						
			if(element.isSelected()) {
				checkBoxValue = element.getAttribute("value");
				break;
			}
				
		}*/
			/*if(driver.findElement(By.id("checkBoxOption1")).isSelected()) {
			System.out.println("inside");
			System.out.println(driver.findElement(By.id("checkBoxOption1")).getAttribute("value"));
		}*/
		
		//select the dropdown value
		Select select = new Select(driver.findElement(By.id("dropdown-class-example")));
		select.selectByValue(checkBoxValue);
		
		//send the textbox value
		driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys(checkBoxValue);
		
		driver.findElement(By.cssSelector("#alertbtn")).click();
		Thread.sleep(2000);
		
		String alertMessage = driver.switchTo().alert().getText();
		
		System.out.println(alertMessage);
		if(alertMessage.contains(checkBoxValue)) {
			System.out.println("Alert Contains the checkbox value "+checkBoxValue);
		}
				
		
		driver.switchTo().alert().dismiss();
		
		
	}

}
