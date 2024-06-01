package Basics_Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Isselected 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/BASHA/OneDrive/Documents/learningHTML1.html");
		
		WebElement boycheckbox = driver.findElement(By.id("123"));
		boolean b1 = boycheckbox.isSelected();
		if(b1 == true)
		{
			System.out.println("its selected");
		}
		else
		{
			System.out.println("its not selected");
			boycheckbox.click();
			System.out.println("I have selected now");
		}

	}

}
