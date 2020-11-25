package tabel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabelExcesise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium-Rahul\\Selenium-ChromeDriverExe\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/30369/rr-vs-kxip-9th-match-indian-premier-league-2020");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		//cb-col cb-col-100 cb-ltst-wgt-hdr 
		
		List <WebElement> rows = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")); //get the specific row 3rd column
		int size = rows.size()-2;
		int i =0;
		/*for(WebElement row : rows) {
			if(i<size) {
			System.out.println(row.getText());
			i++;}
		}*/
		
		int total = 0;
		
		for(int j=0; j<rows.size()-2; j++) {
			
			String socre = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(j).getText();
			total= total+Integer.parseInt(socre);
		}
		
		//get the extra row
		//cb-col cb-col-100 cb-scrd-itms cb-col cb-col-8 text-bold cb-text-black text-right
		
		//travese to second sibling from extra
		String extra = driver.findElement(By.xpath("//div[text()='Extras'] /following-sibling::div")).getText();
		total = total + Integer.parseInt(extra);
		System.out.println(total);
		String totDisplay = driver.findElement(By.xpath("//div[text()='Total'] /following-sibling::div")).getText();
		System.out.println(totDisplay);
		if(total == Integer.parseInt(totDisplay)) {
			System.out.println("total equal");
			
		}
		else {
			System.out.println("total not equal");
		}

	}

}
