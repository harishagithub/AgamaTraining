package com.homework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakyMyTrip {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		
		
		//Select Flight
		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[1]/a/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[1]/a/span[2]")).click();
		
		//		Actions act = new Actions(driver);
//		act.sendKeys(Keys.ENTER).perform();
//		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[1]/a/span[2]")).click();
		
		//Select From
				WebElement pune= driver.findElement(By.xpath("//*[@id=\"fromCity\"]"));
		pune.sendKeys("pune");
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.sendKeys(Keys.DOWN).perform();
		action.sendKeys(Keys.ENTER).perform();
		
		//Select To
	WebElement bom = driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input"));
		bom.sendKeys("bom");
	Actions action1 = new Actions(driver);
		Thread.sleep(3000);
		action1.sendKeys(Keys.DOWN).perform();
		action.sendKeys(Keys.ENTER).perform();
		
		//select departure and return date
		
		//click departure
		WebDriverExtensions.FindElement(driver, By.xpath("//*[@id=\'root\']/div/div[2]/div/div/div[2]/div[1]/div[3]/label/span")).click();
		//click date
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[5]/div[6]/div")).click();
		Thread.sleep(3000);
		//click return
		 driver.findElement(By.xpath("//span[@class='lbl_input latoBold appendBottom10' and text()='RETURN']")).click();
			//click on right arrow 
		    driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[1]/span[2]")).click();
			//Click on Sept 9
		   
		    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[2]/div[4]/div/p")).click();
		//click on search
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/p/a")).click();


	}

}
