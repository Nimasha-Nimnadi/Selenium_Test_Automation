package com.example.tests;

import com.example.pages.LoginPage;
import com.example.pages.LogoutPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest {

    @Test
    public void testLogout() {
        // Log in
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickLogin();

        // Perform logout
        LogoutPage logoutPage = new LogoutPage(driver);
        logoutPage.clickProfileMenu();
        logoutPage.clickLogout();

        // Verify redirection to the login page
        Assert.assertTrue(driver.getCurrentUrl().contains("login"), "Logout failed: Not redirected to login page.");
    }
}
