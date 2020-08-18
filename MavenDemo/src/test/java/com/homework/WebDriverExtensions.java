package com.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebDriverExtensions
{

    public static WebElement FindElement(WebDriver driver, By byXpath) throws InterruptedException{

    	int timeoutInMilliSeconds = 3000;
        
    	Thread.sleep(timeoutInMilliSeconds);
    	return driver.findElement(byXpath);
    }
    
}


