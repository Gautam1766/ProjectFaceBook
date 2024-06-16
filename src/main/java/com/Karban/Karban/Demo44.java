package com.Karban.Karban;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo44 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
	//	driver.findElement(By.id("alertexamples")).click();
	//	driver.findElement(By.id("confirmexample")).click();
		driver.findElement(By.id("promptexample")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("NO");
		driver.switchTo().alert().dismiss();
	}

}
