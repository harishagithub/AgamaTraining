package com.TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class DifferentBrowser {
WebDriver driver;
	
	//@Parameter("browserName")
	@BeforeTest
	public void setup(String browserName){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		if(browserName.equalsIgnoreCase("facebook")){
			driver.get("https://www.facebook.com/");
		}
		else if (browserName.equalsIgnoreCase("gmail")){
			driver.get("http://www.gmail.com");
		}
		
	}
	
	public void facebook(){
		
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.navigate().to("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("aaaa");
		driver.findElement(By.xpath("//*[@id='u_0_b']")).click();
		}
	
	
	
	@AfterTest
	public void teardown(){
		driver.close();
	
	}
	
	

}


