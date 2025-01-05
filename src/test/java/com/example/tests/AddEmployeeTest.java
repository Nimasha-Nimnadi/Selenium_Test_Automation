package com.example.tests;

import com.example.pages.AddEmployeePage;
import com.example.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddEmployeeTest extends BaseTest {

    @Test
    public void testAddEmployee() {
        // Log in
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickLogin();
        System.out.println("Login successful.");

        // Navigate to PIM > Add Employee
        AddEmployeePage addEmployeePage = new AddEmployeePage(driver);
        addEmployeePage.navigateToAddEmployee();
        System.out.println("Navigated to Add Employee page.");

        // Add employee details
        String firstName = "Nimasha";
        String lastName = "Nimnadi";
        addEmployeePage.enterFirstName(firstName);
        addEmployeePage.enterLastName(lastName);
        addEmployeePage.clickSave();
        System.out.println("Employee details entered and saved.");

        // Verify employee is added
        // Update the verification logic to check specific elements for success
        boolean isEmployeeAdded = driver.getPageSource().contains(firstName) && driver.getPageSource().contains(lastName);
        Assert.assertTrue(isEmployeeAdded, "Employee not added successfully.");
        System.out.println("Employee added successfully: " + firstName + " " + lastName);
    }
}
