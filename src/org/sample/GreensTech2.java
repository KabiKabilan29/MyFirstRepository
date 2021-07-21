package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensTech2 {
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
		WebElement mouseOver2 = driver.findElement(By.xpath("//span[text()='Oracle (48)']"));
		a.moveToElement(mouseOver2).perform();
		WebElement find = driver.findElement(By.xpath("//span[text()='Oracle SQL and PLSQL Placement Certification Training']"));
		find.click();
	}
	public static void main(String[] args) {
		GreensTech2 g = new GreensTech2();
		g.green();
	}
}
