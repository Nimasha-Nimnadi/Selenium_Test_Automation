package com.example.tests;

import com.example.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin() {
        // Initialize the LoginPage
        LoginPage loginPage = new LoginPage(driver);

        // Perform login
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickLogin();

        // Assert the title of the landing page
        String expectedTitle = "OrangeHRM";
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle), "Login failed: Incorrect page title.");
    }
}
