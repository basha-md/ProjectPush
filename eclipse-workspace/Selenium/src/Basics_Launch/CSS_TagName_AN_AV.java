package Basics_Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_TagName_AN_AV 
{

	public static void main(String[] args)
{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		WebElement search = driver.findElement(By.cssSelector("textarea[class='gLFyf']"));
		
		search.sendKeys("India");
		search.sendKeys(Keys.ENTER);

	}

}