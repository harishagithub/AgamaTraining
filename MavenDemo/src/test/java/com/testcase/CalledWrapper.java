package com.testcase;

import java.io.IOException;

public class CalledWrapper {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WrapperMethod wm = new WrapperMethod();
		 
		  wm.insertapp("https://opensource-demo.orangehrmlive.com/");
		  wm.enterbyid("txtUsername", "Admin ");
		  wm.enterbyid("txtPassword", "admin123");
		  wm.clickbyxpath("//*[@id=\'btnLogin\']");
		  wm.takesnap("‪C:\\Users\\haris\\Desktop\\snap1.png");
		  wm.closeapp();
			}

}
