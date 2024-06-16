package com.Karban.Karban;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fieupload {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.filemail.com/share/upload-file");
		WebElement e1=driver.findElement(By.id("addBtn"));
		Thread.sleep(2000);
		Actions ac=new Actions(driver);
		ac.click(e1).perform();
		StringSelection s1=new StringSelection("C:\\Users\\pc\\Documents\\hw.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1, null);
		Robot rb=new Robot();
		rb.delay(5000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
