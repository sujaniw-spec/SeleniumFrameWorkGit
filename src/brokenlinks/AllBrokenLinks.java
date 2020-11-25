package brokenlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AllBrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Selenium-Rahul\\Selenium-ChromeDriverExe\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		//String url = driver.findElement(By.cssSelector("a[href='https://www.soapui.org/']")).getAttribute("href");
		
		SoftAssert softAssert = new SoftAssert();
		
		List <WebElement>  links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		int response_code=0;
		
		for(WebElement link : links) {
			
			String url = link.getAttribute("href");
			
			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			response_code = conn.getResponseCode();
			if(response_code > 400) {
				System.out.println("The link of text "+link.getText() +" "+"Response Code "+response_code);
				Assert.assertTrue(false);
			}
			//HardAssert
			//Assert.assertTrue(response_code < 400,"The link with text "+link.getText() +" is broken with the code "+response_code);
			//SoftAssert- not immediatley stop the program
			softAssert.assertTrue(response_code < 400,"The link with text "+link.getText() +" is broken with the code "+response_code);
			
		}
		softAssert.assertAll(); //catch allthe errors and display at the end.
		
	}

}
