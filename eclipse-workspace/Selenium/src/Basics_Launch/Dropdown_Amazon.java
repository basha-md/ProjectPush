package Basics_Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Amazon 
{

	public static void main(String[] args)
	{
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		WebElement e1 = driver.findElement(By.id("searchDropdownBox"));
		
		
		Select s1 = new Select(e1);
		//s1.selectByValue("search-alias=fashion");
		//s1.selectByVisibleText("Amazon Fresh");
		s1.selectByIndex(5);
		
		

	}

}
