package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeDepot2 {
	//Performing mouse over actions.
	private void home() throws InterruptedException {
					
		//Configuring browser.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priya\\eclipse-workspace\\SeleniumTask5\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		//Accessing browser and printing title and URL of the page.
		driver.get("https://www.homedepot.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
					
		//Performing mouse over actions.
		Thread.sleep(5000);
		WebElement mouseOver1 = driver.findElement(By.xpath("//a[text()='All Departments']"));
		Actions a = new Actions(driver);
		a.moveToElement(mouseOver1).perform();
		Thread.sleep(5000);
		WebElement mouseOver2 = driver.findElement(By.xpath("(//a[text()='Paint'])[1]"));
		a.moveToElement(mouseOver2).perform();
		Thread.sleep(5000);
		WebElement mouseOver3 = driver.findElement(By.xpath("(//a[@class='MainFlyout__link'])[21]"));
		a.moveToElement(mouseOver3).perform();
		Thread.sleep(5000);
		WebElement findElement = driver.findElement(By.xpath("//a[text()='Ceiling Paint']"));
		findElement.click();
	}
	public static void main(String[] args) throws InterruptedException {
		HomeDepot2 h = new HomeDepot2();
		h.home();
	}

}
