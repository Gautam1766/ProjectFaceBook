package com.Karban.Karban;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSHOT {
	
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazom.in");
		WebElement e1=driver.findElement(By.xpath("//a[text()='Mobiles']"));
		
		File source=e1.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\pc\\Documents\\eclipse-workspace\\Karban\\ScreenShot\\h1.png");
		FileUtils.copyFile(source, dest);
	}

}
