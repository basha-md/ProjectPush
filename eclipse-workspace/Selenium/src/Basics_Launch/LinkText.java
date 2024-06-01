package Basics_Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LinkText 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		driver.findElement(By.linkText("Gmail")).click();
		
		
		
		
	}

}
