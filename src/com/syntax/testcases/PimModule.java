package com.syntax.testcases;

import org.testng.annotations.Test;

public class PimModule {

	@Test (groups= {"Regression", "Smoke"})
	public void validatePimModule() {
		System.out.println("This is PIM Module testcase");
	}
	
	@Test(groups= {"Regression"})
	public void validateAddEmployee() {
		System.out.println("This is Add Employee testcase");
	}
	
	@Test(groups= {"Regression"})
	public void validateRemoveEmployee() {
		System.out.println("This is Remove Employee testcase");
	}
	
}
