package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	//Performing mouse over actions in flipkart.
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
		WebElement mseOver = driver.findElement(By.xpath("//div[text()='Home']"));
		a.moveToElement(mseOver).perform();
		WebElement btnBath = driver.findElement(By.xpath("(//a[@class='_6WOcW9 _3YpNQe'])[6]"));
		btnBath.click();
		Thread.sleep(3000);
		WebElement txtTowel = driver.findElement(By.xpath("(//a[contains(text(),'Towel')])[2]"));
		String text = txtTowel.getText();
		System.out.println(text);
	}
	public static void main(String[] args) throws InterruptedException {
		Flipkart f = new Flipkart();
		f.flip();
	}
}
