package Basics_Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTyping_Search 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		//driver.findElement(By.name("q")).sendKeys("India");
		//driver.findElement(By.name("q")).click();
		//driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//textarea[1]")).sendKeys("India");
		driver.findElement(By.xpath("//textarea[1]")).sendKeys(Keys.ENTER);

	}

}
