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

public class Demo889 {

	public static void main(String[] args) throws AWTException, Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://ps.uci.edu/~franklin/doc/file_upload.html");
		Thread.sleep(5000);
		WebElement e1=driver.findElement(By.xpath("//input[@name='userfile']"));
		Actions act=new Actions(driver);
		act.click(e1).perform();
		StringSelection copy=new StringSelection("‪C:\\Users\\pc\\Documents\\hw.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().getContents(copy);
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
