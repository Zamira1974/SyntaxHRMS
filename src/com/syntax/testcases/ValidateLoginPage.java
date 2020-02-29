package com.syntax.testcases;

import com.syntax.pages.LoginPageFactory;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.Constants;

public class ValidateLoginPage extends CommonMethods{

	
	public static void main(String[] args) {
		
		setUp("chrome", Constants.HRMS_URL);
		LoginPageFactory pim=new LoginPageFactory();
	
		pim.userName.sendKeys("Admin");
		
		pim.password.sendKeys("Syntax@123");
		
	}
}
