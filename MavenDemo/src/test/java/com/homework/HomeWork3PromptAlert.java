package com.homework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeWork3PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame(driver.findElement(By.name("iframeResult")));
		driver.findElement(By.xpath("/html/body/button")).click();
		Alert alert= driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("Harry Potter");
		
		Thread.sleep(3000);
		alert.accept();
	}

}
