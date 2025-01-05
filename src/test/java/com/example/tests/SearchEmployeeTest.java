package com.example.tests;

import com.example.pages.EmployeeListPage;
import com.example.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchEmployeeTest extends BaseTest {

    @Test
    public void testSearchEmployee() {
        // Log in
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickLogin();

        // Search for an employee
        EmployeeListPage employeeListPage = new EmployeeListPage(driver);
        employeeListPage.searchEmployee("Jobin");

        // Verify search results
        Assert.assertTrue(driver.getPageSource().contains("Jobin"), "Employee not found.");
    }
}
