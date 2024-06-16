package com.Karban.Karban;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo332 {

	public static void main(String[] args) throws Exception {
		String ExpMonth="June";
		String ExpDay="18";
		String ExpYear="2024";
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ixigo.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[@data-testid='departureDate']")).click();
       Thread.sleep(2000);
      
       driver.findElement(By.xpath("//span[text()='March 2024']")).click();
       while(true) 
       {
        Thread.sleep(2000);
    	String ActYear=driver.findElement(By.xpath("//span[@class='react-calendar__navigation__label__labelText react-calendar__navigation__label__labelText--from']")).getText();
        
        if(ActYear.equals(ExpYear)) 
        {
        	
        	List <WebElement> l1 =driver.findElements(By.xpath("//button[@class='react-calendar__tile react-calendar__tile--now react-calendar__tile--hasActive react-calendar__decade-view__years__year']/"));
        	for(WebElement l2:l1) 
        	{
        		l2.getText();
        	}
        	
        }
    	
//      System.out.println(ActYear);
      
		
		
//		
//		
		
		}
	////button[@class='react-calendar__tile react-calendar__year-view__months__month']/abbr

	
}}
