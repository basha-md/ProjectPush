package Basics_Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class RelativeXpath_HTML 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/BASHA/OneDrive/Documents/learningHTML1.html");
		WebElement un = driver.findElement(By.xpath("//input[1]"));
		un.sendKeys("kudos");
		
		WebElement ht = driver.findElement(By.xpath("//input[@name='say hello']"));
		ht.sendKeys("welcome");
		
	    WebElement ps = driver.findElement(By.xpath("//input[@name='password']"));
		ps.sendKeys("yes@123");
		
		WebElement fn = driver.findElement(By.xpath("//input[@name='fname']"));
		fn.sendKeys("fname");
		
		WebElement submit = driver.findElement(By.xpath("//input[3]"));
		submit.click();
		
		WebElement boy = driver.findElement(By.xpath("//input[@id='123']"));
		boy.click();
		
		WebElement girl = driver.findElement(By.xpath("//input[@name='name2']"));
		girl.click();
		
		WebElement baby = driver.findElement(By.xpath("//input[@id='321']"));
		baby.click();
		

		WebElement male = driver.findElement(By.xpath("(//input)[11]"));
		male.click();
		
		WebElement female = driver.findElement(By.xpath("(//input)[12]"));
		female.click();
		
		WebElement checkbox = driver.findElement(By.xpath("(//input)[13]"));
		checkbox.click();
		
		WebElement dropdown = driver.findElement(By.id("Relegion"));
		
		Select s1 = new Select(dropdown);
		s1.selectByValue("3");
		
		WebElement signup = driver.findElement(By.xpath("(//input)[14]"));
		signup.click();
		
		
		
		
		
	}

}
