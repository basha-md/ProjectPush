package Basics_Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Partial_LinkText
{

	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.findElement(By.partialLinkText("Best")).click();
		
		
		
		
		
	}

}
