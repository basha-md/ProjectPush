package Basics_Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class F12_RightClickOnNotWorking 
{

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		
		WebElement login = driver.findElement(By.xpath("(//a[@class='login_button'])[1]"));
		login.click();
		
		WebElement un = driver.findElement(By.id("username"));
		//WebElement un = driver.findElement(By.xpath("//input[@id='username']"));
		un.sendKeys("sfrsg");
		
		WebElement pd = driver.findElement(By.name("password"));
		pd.sendKeys("2325gfgs");
		
		WebElement captcha = driver.findElement(By.name("loginCaptchaValue"));
		captcha.sendKeys("2325fsgrs");

	}

}
