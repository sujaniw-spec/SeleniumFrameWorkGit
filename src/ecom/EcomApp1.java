package ecom;

import java.time.Clock;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.core.util.SystemClock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Sleeper;
//import org.openqa.selenium.support.ui.



public class EcomApp1 {
	public final static long DEFAULT_SLEEP_TIMEOUT = 500;
	
	public static void main(String[] args) {// throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium-Rahul\\Selenium-ChromeDriverExe\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); //implicity wait.apply globaly. apply to every line of code. But, if it is load before 5 seconds it wont wait. Display the pages
		WebDriverWait w = new WebDriverWait(driver, 5);//explicity wait
		
			
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//Thread.sleep(3000);
		String [] productArray = {"Cucumber","Brocolli","Tomato"};
		
		//By.cssSelector("h4[class='product-name']
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("h4[class='product-name']")));//wait until load allitems in the page , before add to the cart
		addItem(driver, productArray);
		
		//click the cart
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		
		//promocode
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		//explicity wait

		//TickingClock clock = new TickingClock();
		
		
	    
		
	   // driver, new SystemClock(), Sleeper.SYSTEM_SLEEPER, timeOutInSeconds, DEFAULT_SLEEP_TIMEOUT
		/*public WebDriverWait(WebDriver driver,
                java.time.Clock clock,
                Sleeper sleeper,
                long timeOutInSeconds,
                long sleepTimeOut)*/
    w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
				
		

	}
	
	public static void addItem(WebDriver driver,String [] productArray) {
		
		List <WebElement> productNameList = driver.findElements(By.cssSelector("h4[class='product-name']"));
		System.out.println(productNameList.size());
		int productArraySize= productArray.length;
		//check whether product name in the product list
		
		List <String>listOfItemNeeded = Arrays.asList(productArray);
		
		int countUntilArrayLength=0;
		int count=0;
		for(WebElement productName:productNameList) {
			
			String product = productName.getText();
			//format it to get real product name remove 1 - kg part
			product = product.split("-")[0].trim();
			
			if(listOfItemNeeded.contains(product)) {
				//click on add to cart
				//driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(count).click(); // add to cart text change to added. Therefore text change.
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(count).click();//click the relavent addtocart button
				
				
				//Thread.sleep(3000);
				countUntilArrayLength++;
			}
			if(countUntilArrayLength ==  productArraySize) {
				
				break;
			}
			count++;
		}
		
		
	}

}
