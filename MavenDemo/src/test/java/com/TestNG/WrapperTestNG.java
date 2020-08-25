package com.TestNG;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testcase.WrapperMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WrapperTestNG {
	
	WebDriver driver;
	WrapperMethod wm = new WrapperMethod();
	@BeforeTest
	public void launchApp() {
		 wm.insertapp("https://opensource-demo.orangehrmlive.com/");
	}
	@Test
	public void testcase1() {
		 
		  wm.enterbyid("txtUsername", "Admin ");
		  wm.enterbyid("txtPassword", "admin123");
		  wm.clickbyxpath("//*[@id=\'btnLogin\']");
			
		}
	
	@Test
	public void testcase2() throws IOException {
		wm.takesnap("src/test/resources/ScreenShot/sample3.png");
		
			
		}
	@AfterMethod
	public void closeApp() {
		wm.closeapp();
	}
	

}
