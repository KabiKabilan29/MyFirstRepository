package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Guru99 {
	//Doing drag and drop mouse action.
	private void guru() throws InterruptedException {
		
		//Configuring browser.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priya\\eclipse-workspace\\SeleniumTask5\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Accessing web page and printing URL and title of page.
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//Performing drag and drop action.
		Actions a = new Actions(driver);
		WebElement btnBank = driver.findElement(By.xpath("//li[@class='block14 ui-draggable']"));
		WebElement btnAccount = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(btnBank, btnAccount).perform();
		Thread.sleep(5000);
		WebElement btn5000 = driver.findElement(By.xpath("(//li[@class='block13 ui-draggable'])[1]"));
		WebElement btnAmount = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		a.dragAndDrop(btn5000, btnAmount).perform();
		Thread.sleep(5000);
		WebElement btnSales = driver.findElement(By.xpath("//li[@class='block15 ui-draggable']"));
		WebElement btnAccount2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		a.dragAndDrop(btnSales, btnAccount2).perform();
		Thread.sleep(5000);
		WebElement btn50002 = driver.findElement(By.xpath("(//li[@class='block13 ui-draggable'])[1]"));
		WebElement btnAmount2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		a.dragAndDrop(btn50002, btnAmount2).perform();
	}
	public static void main(String[] args) throws InterruptedException {
		Guru99 g = new Guru99();
		g.guru();
	}
}
