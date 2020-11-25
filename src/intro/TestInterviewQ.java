package intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestInterviewQ {

public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Selenium-Rahul\\Selenium-ChromeDriverExe\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
String tag = driver.findElement(By.xpath("//*[text()='Radio Button Example']")).getTagName(); //get the element by text. If source code is disabled(* mean all the tag names)
System.out.println(tag);
//driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click(); // get the  sibling item
String label = driver.findElement(By.xpath("//div[@class='left-align']/fieldset/label[1]/following-sibling::label")).getText(); // get the  sibling item
System.out.println(label);
String radio = driver.findElement(By.xpath("//div[@class='left-align']/fieldset/label[1]/following-sibling::label[1]")).getTagName();   // /following-sibling::label[1]/input[1]")).getText(); // get the  sibling item
System.out.println(radio);
//System.out.println(driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role")); // get the parent in xpath
System.out.println(driver.findElement(By.xpath(".//input[@class='radioButton']/parent::label")).getAttribute("for")); // get the parent in xpath


}
}


