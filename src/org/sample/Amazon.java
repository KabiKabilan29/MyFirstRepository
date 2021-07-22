package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	//Performing mouse actions.
	
	public static void username() {
		System.out.println("User name code");

	}
	private void amazon() throws InterruptedException {
		
		//Configuring browser.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priya\\eclipse-workspace\\SeleniumTask5\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Accessing browser and printing title and URL of the page.
		driver.get("http://www.amazon.in");
		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//Performing mouse over actions.
		Actions a = new Actions(driver);
		WebElement mscOver = driver.findElement(By.xpath("//span[text()='Prime']"));
		a.moveToElement(mscOver).perform();
		Thread.sleep(3000);
		WebElement imgFree = driver.findElement(By.id("multiasins-img-link"));
		imgFree.click();
	}
	public static void main(String[] args) throws InterruptedException {
		Amazon a = new Amazon();
		a.amazon();
		username();
	}
}
