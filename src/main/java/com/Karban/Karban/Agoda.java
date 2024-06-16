package com.Karban.Karban;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Agoda {

	public static void main(String[] args) throws InterruptedException {
		String Expmonthyear="June 2024";
		String ExpDay="18";
		WebDriver driver=new  ChromeDriver();
	    driver.get("https://www.agoda.com/");
	//	driver.get("https://www.goibibo.com/");
	//	driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		driver.findElement(By.id("check-in-box")).click();
	//	driver.findElement(By.xpath("//span[text()='Departure']")).click();
		while(true) 
		{
			String Actmonthyear=driver.findElement(By.xpath("//div[@class='DayPicker-Months' ]/div[@class='DayPicker-Month'] /div [@class='DayPicker-Caption'] ")).getText();
			
		//	String Actmonthyear=driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[@class='DayPicker-Month']/div[@class='DayPicker-Caption']")).getText();
			if(Actmonthyear.equals(Expmonthyear)) 
			{
				
				List <WebElement> l1=driver.findElements(By.xpath("//span[@class='DayPicker-Day__label']"));
		//		List <WebElement> l1=driver.findElements(By.xpath("//div[@class='DayPicker-Day']/p"));
				////div[@class='DayPicker-Day']/p
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
				driver.findElement(By.xpath("// button[@aria-label='Next Month']")).click();
			}
		}
	//	driver.findElement(By.xpath("//button[@aria-label='Close Message']")).click();
		

	}

}
