package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium-Rahul\\Selenium-ChromeDriverExe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		
		//Validate if the title is correct
		System.out.println(driver.getTitle());
		//xpath syntax -   //tagname[@attribute='value']

		/*driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sujaniw@yahoo.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("ILoveRedlight#$1");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		*/
		//CSS selector syntax -   tagname[attribute='value']
		
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("cssselecot"); 
		//driver.findElement(By.cssSelector("#email")).sendKeys("cssselecot"); //can use only by id
		
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("passswordss");
		//driver.findElement(By.cssSelector("button[value='1']")).click(); 
		driver.findElement(By.cssSelector("[value='1']")).click(); // you can use without tagname too
		//driver.findElement(By.cssSelector("button#u_0_f")).click(); // another way to get CSS selector. But have to have id attribute
		
		
		
		
				
		

	}

}
