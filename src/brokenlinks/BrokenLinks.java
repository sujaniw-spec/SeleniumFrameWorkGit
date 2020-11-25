package brokenlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Selenium-Rahul\\Selenium-ChromeDriverExe\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		//String url = driver.findElement(By.cssSelector("a[href='https://www.soapui.org/']")).getAttribute("href");
		String url = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
		
		HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		System.out.println(conn.getResponseCode());
		
		
		//Broken URL
		//get all the url in the pagein selenium
		//Java methods will call the URLs and get you the status code
		//if the status code > 400 then the URL is not working -->link which tied to a url is broken
		
		
	}

}
