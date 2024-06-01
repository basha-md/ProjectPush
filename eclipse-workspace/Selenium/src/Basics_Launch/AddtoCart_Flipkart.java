package Basics_Launch;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddtoCart_Flipkart 
{

	public static void main(String[] args)
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("shoe");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Keys.ENTER);
		
		
		
		WebElement search = driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		search.click();
		
		 Set<String> s1 =     driver.getWindowHandles();
		 System.out.println(s1);
		
		 Iterator<String> pcid =   s1.iterator();
		 String parentid       = pcid.next();
		 String childid       = pcid.next();
		 System.out.println(parentid);
		 System.out.println(childid);
	}

}
