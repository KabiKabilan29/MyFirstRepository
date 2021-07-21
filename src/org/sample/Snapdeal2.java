package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal2 {
	//Performing mouse over actions in snap deal.
	private void snap() throws InterruptedException {
		
		//Configuring browser.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priya\\eclipse-workspace\\SeleniumTask5\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		//Accessing browser and printing title and URL of the page.
		driver.get("https://www.snapdeal.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
					
		//Performing mouse over actions.
		Thread.sleep(5000);
		WebElement mouseOver1 = driver.findElement(By.xpath("(//span[@class='catText'])[7]"));
		Actions a = new Actions(driver);
		a.moveToElement(mouseOver1).perform();
		Thread.sleep(5000);
		WebElement findElement = driver.findElement(By.xpath("(//span[text()='Footwear'])[2]"));
		findElement.click();
		Thread.sleep(5000);
		WebElement findElement2 = driver.findElement(By.xpath("(//div[@class='child-cat-name '])[1]"));
		findElement2.click();
	}
	public static void main(String[] args) throws InterruptedException {
		Snapdeal2 s = new Snapdeal2();
		s.snap();
	}
}
