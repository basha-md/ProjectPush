package Basics_Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_1stShoe 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("shoe");
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		
		driver.findElement(By.xpath("(//a[@class='rPDeLR'])[1]")).click();
		

	}

}
