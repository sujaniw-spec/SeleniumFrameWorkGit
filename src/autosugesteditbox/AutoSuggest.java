package autosugesteditbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class AutoSuggest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();

		//options.addArguments("--disable-notifications");
		
		options.addArguments("--disable-popup-blocking");

		System.setProperty("webdriver.chrome.driver","C:\\Selenium-Rahul\\Selenium-ChromeDriverExe\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://www.makemytrip.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		//String JS_DISABLE_UNLOAD_DIALOG = "Object.defineProperty(BeforeUnloadEvent.prototype, 'returnValue', { get:function(){}, set:function(){} });";

				//((JavascriptExecutor)driver).executeScript(JS_DISABLE_UNLOAD_DIALOG);

				//driver.quit();


		
		//Thread.sleep(2000);
		WebElement popUp = driver.findElement(By.cssSelector(".makeFlex.hrtlCenter.font10.makeRelative.lhUser"));

		int popSize = driver.findElements(By.cssSelector(".makeFlex.hrtlCenter.font10.makeRelative.lhUser")).size();

		if(popSize > 0){

		popUp.click();
		driver.switchTo().defaultContent().findElement(By.id("fromCity")).click();
		
		}
		//driver.switchTo().defaultContent().findElement(By.id("fromCity")).click();
		/*driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");

		driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();

		driver.switchTo().defaultContent();*/


		//driver.findElement(By.cssSelector("div[class='makeFlex column flexOne whiteText latoBold']")).click();
		Thread.sleep(2000);
		//WebElement fromInputBox= 
			//	driver.findElement(By.id("fromCity")).click();
			Actions a = new Actions(driver);	
			Thread.sleep(2000);
			

			//	driver.findElement(By.id("fromCity")).click();
				//Thread.sleep(2000);
				//driver.findElement(By.id("fromCity")).sendKeys("COL");
				
				a.moveToElement(driver.findElement(By.id("fromCity"))).click().sendKeys("COL").build().perform();
			//	Thread.sleep(2000);
				//driver.findElement(By.id("fromCity")).click();
				Thread.sleep(2000);
			//	a.moveToElement(driver.findElement(By.id("fromCity"))).click().build().perform();
				//driver.findElement(By.id("react-autowhatever-1-section-0-item-0")).click();
				
				driver.findElement(By.xpath("//ul[@role='listbox']/li[2]")).click();
				//driver.findElement(By.id("fromCity")).sendKeys(Keys.ARROW_DOWN);
				//driver.findElement(By.id("fromCity")).sendKeys(Keys.ENTER);
			//	driver.findElement(By.className("fsw_inputBox searchCity inactiveWidget activeWidget")).click();
		//driver.findElement(By.id("react-autowhat"ever-1")).click();
		
		//fromInputBox.click();
		//fromInputBox.clear();
				a.moveToElement(driver.findElement(By.id("toCity"))).click().sendKeys("DEL").build().perform();
				driver.findElement(By.xpath("//ul[@role='listbox']/li[2]")).click();
	}

}
