package Basics_Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Displayed_Enabled 
{

	public static void main(String[] args) 
	{

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		WebElement search = driver.findElement(By.name("q"));
		
		if(search.isDisplayed() && search.isEnabled() )
		{
			search.sendKeys("India");
		}
		

	}

}
