package Basics_Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchTitle 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.name("q")).sendKeys("sample eg text");
		driver.findElement(By.name("q")).click();
		//driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		

	}

}
