package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart5 {
	//Performing mouse over and click in flipkart site.
	private void flip() throws InterruptedException {
					
		//Configuring Browser.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priya\\eclipse-workspace\\SeleniumTask5\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
					
		//Accessing browser and printing title and URL of the page.
		driver.get("http://www.flipkart.com");
		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
				
		//Performing mouse over actions.
		WebElement btnCross = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		btnCross.click();
		Actions a = new Actions(driver);
		Thread.sleep(3000);
		WebElement mseOver = driver.findElement(By.xpath("(//img[@class='_396cs4 _3exPp9'])[7]"));
		a.moveToElement(mseOver).perform();
		Thread.sleep(3000);
		WebElement mseOver2 = driver.findElement(By.xpath("//a[text()='Televisions']"));
		a.moveToElement(mseOver2).perform();
		Thread.sleep(3000);
		WebElement all = driver.findElement(By.xpath("//a[text()='All']"));
		all.click();
		Thread.sleep(3000);
		WebElement tv = driver.findElement(By.xpath("(//img[@class='_396cs4 _3exPp9'])[1]"));
		tv.click();
	}
	public static void main(String[] args) throws InterruptedException {
		Flipkart5 f = new Flipkart5();
		f.flip();
	}
}
