package com.Karban.Karban;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test112 {
	
	public static void main(String[]args) throws InterruptedException 
	{
		String ExpMonthYear="May 2024";
		
		String ExpDay="10";
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		while(true) 
		{
			String ActMonthYear=driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[@class='DayPicker-Month']/div[@class='DayPicker-Caption']")).getText();
			if(ActMonthYear.equals(ExpMonthYear)) 
			{
				List<WebElement> l1=driver.findElements(By.xpath("//div[@class='DayPicker-Day']/div/p"));
				for(WebElement l2:l1) 
				{
					String ActDay=l2.getText();
					if(ActDay.equals(ExpDay)) 
					{
						l2.click();
						break;
					}
				}
				break;
			}
			else 
			{
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
		
	}

	//id="departure"
}
