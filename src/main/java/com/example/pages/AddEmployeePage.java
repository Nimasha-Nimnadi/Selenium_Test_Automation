package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddEmployeePage {

    private WebDriver driver;

    // Locators
    private By pimMenu = By.xpath("//span[text()='PIM']"); // Locator for PIM menu
    private By addEmployeeMenu = By.xpath("//a[text()='Add Employee']"); // Locator for Add Employee
    private By firstNameField = By.name("firstName"); // Locator for first name field
    private By lastNameField = By.name("lastName"); // Locator for last name field
    private By saveButton = By.cssSelector("button[type='submit']"); // Locator for Save button

    // Constructor
    public AddEmployeePage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void navigateToAddEmployee() {
        driver.findElement(pimMenu).click(); // Click on PIM menu
        driver.findElement(addEmployeeMenu).click(); // Click on Add Employee
    }

    public void enterFirstName(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName); // Enter First Name
    }

    public void enterLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName); // Enter Last Name
    }

    public void clickSave() {
        driver.findElement(saveButton).click(); // Click Save button
    }
}
