package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopClues {
	//Doing mouse over actions in site.
	private void shop() {
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
		WebElement mouseOver = driver.findElement(By.id("nav_44"));
		Actions a = new Actions(driver);
		a.moveToElement(mouseOver).perform();
	}
	public static void main(String[] args) {
		ShopClues s = new ShopClues();
		s.shop();
	}
}
