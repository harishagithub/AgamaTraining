package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.ie.driver","C:\\Users\\haris\\Downloads\\Selenium\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id = \'txtUsername\']")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name=\'Submit\' and @id=\'btnLogin\']")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
		Select userRole=new Select(driver.findElement(By.xpath("//*[@id=\"searchSystemUser_userType\"]"))); 
		userRole.selectByVisibleText("ESS");
		Select status=new Select(driver.findElement(By.xpath("//*[@id=\"searchSystemUser_status\"]"))); 
		status.selectByIndex(2);
		status.selectByValue("All");
		
	}

}
