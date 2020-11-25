package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium-Rahul\\Selenium-ChromeDriverExe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		Select adult = new Select(driver.findElement(By.id("Adults")));

		adult.selectByValue("2");

		Select Childrens = new Select(driver.findElement(By.id("Childrens")));

		Childrens.selectByValue("1");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//dl[@class='vertical'] //i[@class='icon ir datePicker']")).click();
		driver.findElement(By.cssSelector("a[class='ui-state-default ui-state-highlight ui-state-active ']")).click();

		driver.findElement(By.xpath("//a[@id='MoreOptionsLink']")).click();

		Select classValue = new Select(driver.findElement(By.id("Class")));
		classValue.selectByValue("Business");

		driver.findElement(By.cssSelector("input[id='AirlineAutocomplete']")).sendKeys("Indigo");

		driver.findElement(By.id("SearchBtn")).click();

		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

	}

}
