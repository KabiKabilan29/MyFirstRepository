package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopClues2 {
	//Performing mouse over actions.
	private void clues() throws InterruptedException {
		//Configuring browser.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priya\\eclipse-workspace\\SeleniumTask5\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();				
		//Accessing site and printing title and URL of the page.
		driver.get("https://www.shopclues.com/wholesale.html");
		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//Performing mouse over actions.
		WebElement mouseOver = driver.findElement(By.xpath("//a[text()='Sports & More']"));
		Actions a = new Actions(driver);
		a.moveToElement(mouseOver).perform();
		Thread.sleep(3000);
		WebElement weightGainers = driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
		weightGainers.click();
	}
	public static void main(String[] args) throws InterruptedException {
		ShopClues2 s = new ShopClues2();
		s.clues();
	}
}
