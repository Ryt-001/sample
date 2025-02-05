package com.test.classes;

import org.testng.annotations.Test;

import com.project.pageclasses.LoginPage;

public class Guru99Test {
	public LoginPage login;
	@Test
	public void doLogin() throws Exception {
		login = new LoginPage();
		login.navigateToUrl();
		login.doLogin();
		login.tearDown();
	}
}
