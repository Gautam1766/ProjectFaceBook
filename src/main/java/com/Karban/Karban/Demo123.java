package com.Karban.Karban;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo123 {

	public static void main(String[] args) throws InterruptedException {
		String ExptMonthYear="May 2024";
		String ExpDay="20";
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.ixigo.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='Departure']")).click();
		while(true) 
		{
		Thread.sleep(2000);	
		String ActMonthYear=driver.findElement
	   (By.xpath("//span[@class='react-calendar__navigation__label__labelText react-calendar__navigation__label__labelText--from']")).getText();
		if(ActMonthYear.equals(ExptMonthYear)) 
		{
			
			List<WebElement> l1=driver.findElements(By.xpath("//button[@class='react-calendar__tile react-calendar__month-view__days__day']/abbr"));
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
			driver.findElement(By.xpath("//button[@class='react-calendar__navigation__arrow react-calendar__navigation__next-button']")).click();
		}
	}
		//driver.findElement(By.xpath(""));

	}}

