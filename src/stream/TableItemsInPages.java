package stream;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableItemsInPages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium-Rahul\\Selenium-ChromeDriverExe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		
		//click on column header
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		//get all the columns in first row
		List <WebElement> list = driver.findElements(By.xpath("//tr/td[1]"));
		
		List <String> orginalList  = list.stream().map(s->s.getText()).collect(Collectors.toList());
		
		List <String> newList = orginalList.stream().sorted().collect(Collectors.toList());
		
		Assert.assertTrue(orginalList.equals(newList));
		
		
		list.stream().forEach(a->System.out.println(a.getText()));
		
		//scan the name with Rice and print the price
		List <String> priceList=null;
		//if element is not in the first page it goes to next page by clicking next button. it goes until find the element.
		
		do {
		List <WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
			
		priceList = rows.stream().filter(s->s.getText().contains("Rice")).map(s->getPrice(s)).collect(Collectors.toList());
		//print the price of Banana
		priceList.stream().forEach(a->System.out.println(a));
		if(priceList.size()==0) {
			driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
		}
		}while(priceList.size()==0);
		
		

	}
	private static String getPrice(WebElement td) {
		
		String price= td.findElement(By.xpath("following-sibling::td[1]")).getText();//td1 's following sibling. price
		
		return price;
		
		
	}

}
