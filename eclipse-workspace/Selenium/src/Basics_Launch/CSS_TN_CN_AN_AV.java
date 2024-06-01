package Basics_Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_TN_CN_AN_AV 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input.Pke_EE[name='q']")).sendKeys("shoe");
	}

}
