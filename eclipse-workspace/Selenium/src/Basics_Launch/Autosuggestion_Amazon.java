package Basics_Launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autosuggestion_Amazon 
{

	public static void main(String[] args) throws InterruptedException
	{
	  FirefoxDriver driver = new FirefoxDriver();
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
	  
	 WebElement search = driver.findElement(By.name("field-keywords"));
	 search.sendKeys("shoe");
	 Thread.sleep(2000);
	 
	 List<WebElement> auto = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
	 
	 int count= auto.size();
	 System.out.println(count);
	 auto.get(5).click();
	  

	}

}
