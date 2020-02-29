package com.syntax.testcases;

import org.testng.annotations.Test;

public class LeaveModule {

	@Test (groups= {"Regression", "Smoke"})
	public void validateLeaveModule() {
		System.out.println("This is Leave Module testcase");
	}
	
	@Test(groups= {"Regression"})
	public void leaveDate() {
		System.out.println("This is leave date testcase");
	}
	
	@Test(groups= {"Regression"})
	public void returnDate() {
		System.out.println("This is return date testcase");
	}
	
}
