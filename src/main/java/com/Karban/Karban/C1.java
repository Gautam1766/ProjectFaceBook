package com.Karban.Karban;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C1 {

	public static void main(String[] args) throws Exception {
		
		
		String ExpMothYear="August 2024";
		String ExpDay="19";
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.agoda.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath(" //i[@class='ficon IconBox__icon ficon-20 ficon-check-in']")).click();
		while(true) 
		{
			
			String ActMonthyear=driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[@class='DayPicker-Month']/div[@class='DayPicker-Caption']")).getText();
			if(ActMonthyear.equals(ExpMothYear)) 
			{
				List <WebElement> l1=driver.findElements(By.xpath("//span[@class='DayPicker-Day__label']"));
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
				driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
			}
		}
		
	}

}
