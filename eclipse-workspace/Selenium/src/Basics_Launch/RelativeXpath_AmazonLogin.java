package Basics_Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RelativeXpath_AmazonLogin 
{

	public static void main(String[] args) 
	{

		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		WebElement un =driver.findElement(By.xpath("//input[@id='ap_email']"));
		un.sendKeys("ashraf@gmail.com");
		WebElement cn =driver.findElement(By.xpath("//input[@id='continue']"));
		cn.click();
		WebElement ps =driver.findElement(By.xpath("//input[@id='ap_password']"));
		ps.sendKeys("dsd@13");
		WebElement sign =driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		sign.click();
		
	}

}
