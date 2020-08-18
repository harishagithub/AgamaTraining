package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonExample {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		//driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).click();
	driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
		
		Actions action= new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("Pantry Lists"))).click();

	}

}
