package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon2 {
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
		WebElement btnReg = driver.findElement(By.xpath("(//a[text()='Start here.'])[1]"));
		btnReg.click();
		Thread.sleep(3000);
		WebElement txtName = driver.findElement(By.id("ap_customer_name"));
		txtName.sendKeys("Admin");
		WebElement txtPhone = driver.findElement(By.id("ap_phone_number"));
		txtPhone.sendKeys("9876543210");
		WebElement txtEmail = driver.findElement(By.id("ap_email"));
		txtEmail.sendKeys("admin123@gmail.com");
		WebElement txtPass = driver.findElement(By.id("ap_password"));
		txtPass.sendKeys("12345^");
		WebElement btnContinue = driver.findElement(By.id("continue"));
		btnContinue.click();
	}
	public static void main(String[] args) throws InterruptedException {
		Amazon2 a = new Amazon2();
		a.amazon();
	}
}
