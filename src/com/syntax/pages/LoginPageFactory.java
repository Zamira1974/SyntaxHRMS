package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.CommonMethods;

public class LoginPageFactory {

		
		@FindBy(xpath = "//div[@id='divLogo']")
		public WebElement logo;
		
		@FindBy(id="logInPanelHeading")
		public WebElement loginLabel;
		
		@FindBy(name="txtUsername")
		public WebElement userName;
		
		@FindBy(css="input#txtPassword")
		public WebElement password;
		
		@FindBy(css="input[name='Submit']")
		public WebElement loginBtn;
		
		@FindBy(id="spanMessage")
		public WebElement errorMsg;
		
		public LoginPageFactory() {
			PageFactory.initElements(CommonMethods.driver, this);
		}
		
}
