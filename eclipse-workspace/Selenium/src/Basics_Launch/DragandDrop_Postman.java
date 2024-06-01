package Basics_Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop_Postman 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/drag-and-drop/");
		
		WebElement drag = driver.findElement(By.xpath("(//div[@id='container'])[7]"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='div2']"));

		WebElement drag1 = driver.findElement(By.xpath("//div[@id='div2']"));
		WebElement drop1 = driver.findElement(By.xpath("(//div[@id='container'])[7]"));
		
		Actions a1 = new Actions(driver);
		a1.dragAndDrop(drag, drop ).perform();
		a1.dragAndDrop(drag1, drop1).perform();

	}

}
