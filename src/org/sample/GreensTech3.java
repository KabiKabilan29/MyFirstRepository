package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensTech3 {
	//Performing mouse over actions.
	private void green() {
			
		//Configuring browser.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priya\\eclipse-workspace\\SeleniumTask5\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
		//Accessing browser and printing title and URL of the page.
		driver.get("http://greenstech.in/selenium-course-content.html");
		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
			
		//Performing mouse over actions.
		WebElement mouseOver1 = driver.findElement(By.xpath("//div[@class='header-browse-greens']"));
		Actions a = new Actions(driver);
		a.moveToElement(mouseOver1).perform();
		WebElement mouseOver2 = driver.findElement(By.xpath("//span[text()='Data Warehousing (5)']"));
		a.moveToElement(mouseOver2).perform();
		WebElement findElement = driver.findElement(By.xpath("//span[text()='Talend Certification Training']"));
		findElement.click();
	}
	public static void main(String[] args) {
		GreensTech3 g = new GreensTech3();
		g.green();
	}
}
