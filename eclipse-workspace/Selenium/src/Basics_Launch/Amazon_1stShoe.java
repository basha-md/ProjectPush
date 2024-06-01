package Basics_Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_1stShoe 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("shoe");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Keys.ENTER);
		
		
		//WebElement search = driver.findElement(By.xpath("//a[@class='a-spacing-none a-link-normal _bGlmZ_link_Gerj5 _bGlmZ_hidden_1Ws_h']"));
		WebElement search = driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		search.click();

	}

}
