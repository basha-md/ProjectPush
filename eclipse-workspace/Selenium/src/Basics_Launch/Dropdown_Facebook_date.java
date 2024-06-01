package Basics_Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class Dropdown_Facebook_date 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().window().maximize();
		
		WebElement day = driver.findElement(By.name("birthday_day"));
		 
		Select s1 = new Select(day);
		s1.selectByValue("20");
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select s2 = new Select(month);
		s2.selectByValue("8");
		
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select s3 = new Select(year);
		s3.selectByIndex(1);
		
		

	}

}
