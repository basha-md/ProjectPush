package Basics_Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AbsoluteXpath_HTML 
{

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/BASHA/OneDrive/Documents/learningHTML1.html");
		WebElement un = driver.findElement(By.xpath("/html/body/input[1]"));
		un.sendKeys("kudos");
		
		WebElement ht = driver.findElement(By.xpath("/html/body/input[2]"));
		ht.sendKeys("welcome");
		
		WebElement ps = driver.findElement(By.xpath("/html/body/input[3]"));
		ps.sendKeys("yes@123");
		

		WebElement fn = driver.findElement(By.xpath("/html/body/form/input[1]"));
		fn.sendKeys("fname");
		
		WebElement submit = driver.findElement(By.xpath("/html/body/form/input[1]"));
		submit.click();
		
		WebElement boy = driver.findElement(By.xpath("/html/body/form[2]/input[1]"));
		boy.click();
		
		
		WebElement girl = driver.findElement(By.xpath("/html/body/form[2]/input[2]"));
		girl.click();
		
		WebElement baby = driver.findElement(By.xpath("/html/body/form[2]/input[3]"));
		baby.click();
		
		//WebElement submit1 = driver.findElement(By.xpath("/html/body/form[2]/input[4]"));
		//submit1.click();
		
		WebElement male = driver.findElement(By.xpath("/html/body/input[4]"));
		male.click();
		
		WebElement female = driver.findElement(By.xpath("/html/body/input[5]"));
		female.click();
		
		WebElement checkbox = driver.findElement(By.xpath("/html/body/input[6]"));
		checkbox.click();
		
WebElement dropdown = driver.findElement(By.id("Relegion"));
		
		Select s1 = new Select(dropdown);
		s1.selectByValue("3");
	}

}
