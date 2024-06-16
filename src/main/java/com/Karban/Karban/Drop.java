package com.Karban.Karban;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		List <WebElement> e1=driver.findElements(By.tagName("select"));
		System.out.println(e1.size());
		for (WebElement e2:e1) 
		{
			System.out.println(e2.getText());
		}
		
		//e1.click();
//		Select sc=new Select(e1);
//		
//		//sc.selectByVisibleText("Bermuda");
//		sc.selectByValue("CAN");
//		sc.selectByIndex(8);
		
		
		
		
	}

}
