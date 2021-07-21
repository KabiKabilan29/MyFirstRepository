package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart2 {
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
		WebElement mseOver = driver.findElement(By.xpath("(//img[@class='_396cs4 _3exPp9'])[4]"));
		a.moveToElement(mseOver).perform();
		Thread.sleep(3000);
		WebElement women = driver.findElement(By.xpath("//a[text()='Women Footwear']"));
		a.moveToElement(women).perform();
		Thread.sleep(3000);
		WebElement womenFlatSlipper = driver.findElement(By.xpath("//a[text()='Women Flats']"));
		womenFlatSlipper.click();
	}
	public static void main(String[] args) throws InterruptedException {
		Flipkart2 f = new Flipkart2();
		f.flip();
	}
}
