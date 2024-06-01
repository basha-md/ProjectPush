package Basics_Launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlltheLinks_Google 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		List<WebElement> links =driver.findElements(By.tagName("a"));
		
		 int count = links.size();
		 System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			WebElement s1 = links.get(i);
			  String link      = s1.getAttribute("href");
			  String linktext  = s1.getText();
			  System.out.println(link);
			  System.out.println(linktext);
		}
	}

}
