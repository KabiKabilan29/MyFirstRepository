package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon3 {
	//Performing click and mouse over actions in amazon web page.
	private void amazon() throws InterruptedException {
		//Configuring browser.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priya\\eclipse-workspace\\SeleniumTask5\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		//Accessing browser and printing title and URL of the page.
		driver.get("https://www.amazon.in/");
		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		Thread.sleep(3000);
		
		//Registering new user.
		WebElement mouseOver = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions a = new Actions(driver);
		a.moveToElement(mouseOver).perform();	
		WebElement yourAcc = driver.findElement(By.xpath("//span[text()='Your Account']"));
		yourAcc.click();
	}
	public static void main(String[] args) throws InterruptedException {
		Amazon3 a = new Amazon3();
		a.amazon();
	}
}
