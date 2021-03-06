package com.sun.appium.fgoal.pages;

import org.openqa.selenium.support.PageFactory;

import com.sun.appium.fgoal.base.BaseClass;
import com.sun.appium.fgoal.objects.LoginPageObject;
import com.sun.appium.fgoal.ultilities.GeneralKeywors;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

/**
 * @author CHIRAG
 *
 */
public class LoginPage {

	LoginPageObject loginPageObject = new LoginPageObject();

	public LoginPage() {
		BaseClass obj = new BaseClass();

		PageFactory.initElements(new AppiumFieldDecorator(obj.getDriver()), loginPageObject);

	}

	public void enterUserName(String username) {
		GeneralKeywors.sendkeys(loginPageObject.usernameTextField, username);
	}

	public void enterPassword(String password) {
		GeneralKeywors.sendkeys(loginPageObject.passwordTextField, password);
		System.out.println(loginPageObject.loginButton.getText());
	}
	
	public void login() {
		loginPageObject.loginButton.click();
	}
}
