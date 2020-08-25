package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testcase.WrapperMethod;

public class Flipkart {
	
	WebDriver driver;
	WrapperMethod wm = new WrapperMethod();
	
	@BeforeTest
	public void launchApp() {
		 wm = new WrapperMethod();
		 wm.insertapp("https://www.flipkart.com/");
	}
	
	@Test
	public void search() {
		wm.enterbyname("q", "mobile");
		//wm.enterkeyusingXpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input");
		
	}

}
