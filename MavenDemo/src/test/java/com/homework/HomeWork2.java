package com.homework;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeWork2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//*[@id=\"onward_cal\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"src\"]")).sendKeys("che");
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		for(int i=0;i<3;i++) {
		action.sendKeys(Keys.DOWN);
		}
		action.sendKeys(Keys.ENTER).perform();
	
		
		
	}

}
