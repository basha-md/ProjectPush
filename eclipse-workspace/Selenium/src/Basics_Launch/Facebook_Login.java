package Basics_Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Facebook_Login 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");

		driver.findElement(By.name("firstname")).sendKeys("ashraf");
		driver.findElement(By.name("lastname")).sendKeys("basha");
		driver.findElement(By.name("reg_email__")).sendKeys("9874563144");
		driver.findElement(By.id("password_step_input")).sendKeys("dgsgwae");
		
		WebElement day = driver.findElement(By.id("day"));
		 
		Select s1 = new Select(day);
		s1.selectByValue("20");
		
		WebElement month = driver.findElement(By.id("month"));
		Select s2 = new Select(month);
		s2.selectByValue("8");
		
		WebElement year = driver.findElement(By.id("year"));
		Select s3 = new Select(year);
		s3.selectByValue("2010");
		
		
		
		
		
		
	}

}
