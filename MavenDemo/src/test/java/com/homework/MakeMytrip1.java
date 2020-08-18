package com.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.collect.Ordering;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMytrip1 {

	public static void main(String[] args) throws InterruptedException {
		
			WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.makemytrip.com/");
			Thread.sleep(3000);
			
		//click on Flight
			driver.findElement(By.xpath("//*[@id=\'SW\']/div[1]/div[2]/div/div/nav/ul/li[1]/a/span[2]")).click();
			driver.findElement(By.xpath("//*[@id=\'SW\']/div[1]/div[2]/div/div/nav/ul/li[1]/a/span[2]")).click();
			Thread.sleep(3000);
			
		//Select From
			WebElement pune= driver.findElement(By.xpath("//*[@id=\"fromCity\"]"));
			pune.sendKeys("pnq");
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
	
		//Click on return
			driver.findElement(By.xpath("//span[@class='lbl_input latoBold appendBottom10' and text()='RETURN']")).click();
		//click on right arrow 
			driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[1]/span[2]")).click();
		//Click on Sept 9
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[2]/div[4]/div/p")).click();
		//click on search
			driver.findElement(By.xpath("//a[text()='Search']")).click();
			
		//sort price in ascending order
			Thread.sleep(10000);
			List<WebElement> actualPrices=driver.findElements(By.className("actual-price"));
			
			List<Integer> actualPricesAsInt = new ArrayList<Integer>();
			
			for (WebElement actualPrice : actualPrices)
			{
				actualPricesAsInt.add(
						Integer.parseInt(actualPrice.getText().subSequence(2, actualPrice.getText().length()).toString().replace(",", ""))
						 );
				 
			}
			
			Collections.sort(actualPricesAsInt);
			
			for(Integer actualPrice : actualPricesAsInt)
			{
			System.out.println(actualPrice);
			}

		 // select seats
			driver.findElement(By.xpath("//*[@id=\"left-side--wrapper\"]/div/div/div[4]/div/div[1]/div/div/div[3]/span")).click();
			//driver.findElement(By.xpath("//*[@id=\"bookbutton-RKEY:b023fea9-3521-4e91-ad5e-4c50e2f256c0:0_0~~~RKEY:b023fea9-3521-4e91-ad5e-4c50e2f256c0:3_0\"]")).click();
			  driver.findElement(By.xpath("//*[text()='Book Now']")).click();
			//	Alert alert= driver.switchTo().alert();
			//alert.accept();
			
			
			
			
			
			
			
			
			
			
			
	}
}