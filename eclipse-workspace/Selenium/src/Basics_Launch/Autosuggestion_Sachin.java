package Basics_Launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion_Sachin 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		WebElement search = driver.findElement(By.id("APjFqb"));
		if(search.isDisplayed() && search.isEnabled()  )
		{
			search.sendKeys("sachin");
			Thread.sleep(2000);
		}
       
		List<WebElement> autosuggestion = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int count = autosuggestion.size();
		System.out.println(count);
		autosuggestion.get(7).click();
		
	}

}
