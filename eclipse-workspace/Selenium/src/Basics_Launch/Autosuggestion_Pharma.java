package Basics_Launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autosuggestion_Pharma 
{

	public static void main(String[] args) throws InterruptedException 
	{
		 ChromeDriver driver = new ChromeDriver();
		  driver.get("https://www.1mg.com/?wpsrc=Google+Organic+Search");
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		
		  WebElement Am = driver.findElement(By.xpath("//div[.='Update']"));
			Am.click();
			 Thread.sleep(2000);
		
			WebElement search = driver.findElement(By.name("name"));
		 
		 search.sendKeys("dolo");
		 Thread.sleep(2000);
		 
		 List<WebElement> auto = driver.findElements(By.xpath("//div[@class='styles__search-results-container___3OUHy']/ul/li"));
		 int count= auto.size();
		 System.out.println(count);
		 auto.get(5).click();
		  
		 

	}

}
