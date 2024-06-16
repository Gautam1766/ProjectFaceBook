package com.Karban.Karban;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLink {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		List <WebElement> l1=driver.findElements(By.tagName("a"));
		
		System.out.println(l1.size());
		for(WebElement l2:l1) 
		{
			System.out.println(l2.getText());
		}
		
		
		
	}

}
