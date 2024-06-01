package Basics_Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Manually_Amazon 
{

	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		WebElement dd = driver.findElement(By.id("searchDropdownBox"));
		
		
		dd.sendKeys(Keys.ARROW_DOWN);
		dd.sendKeys(Keys.ARROW_DOWN);
		dd.sendKeys(Keys.ARROW_DOWN);
		dd.sendKeys(Keys.ARROW_DOWN);

	}

}
