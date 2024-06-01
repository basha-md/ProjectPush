package Basics_Launch;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Finding_Shoe_Amazon 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
        driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("shoes");
        //driver.findElement(By.id("//input[@id='nav-search-submit-button']")).click();
       driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys(Keys.ENTER);
        
        
		
		
		
		
	}

}
