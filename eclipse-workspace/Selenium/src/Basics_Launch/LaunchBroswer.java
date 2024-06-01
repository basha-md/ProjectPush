package Basics_Launch;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBroswer 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in");
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		
		
		

	}

}
