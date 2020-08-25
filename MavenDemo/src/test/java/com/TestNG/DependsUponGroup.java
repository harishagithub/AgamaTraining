package com.TestNG;

import org.testng.annotations.Test;

public class DependsUponGroup {
	
		@Test(groups={"smokeTesting","RegressionTesting"})
		public void testcase1() {
			System.out.println("testcase1");
		}
		@Test(groups={"smokeTesting","sanityTesting"})
		public void testcase2() {
			System.out.println("testcase2");
		}
		@Test(groups={"functionalTesting","retesting"})
		public void testcase3() {
			System.out.println("testcase3");
		}
}
