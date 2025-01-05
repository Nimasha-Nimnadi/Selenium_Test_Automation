package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmployeeListPage {

    private WebDriver driver;

    // Locators
    private By searchField = By.cssSelector("input[placeholder='Search']");
    private By searchButton = By.cssSelector("button[type='submit']");

    // Constructor
    public EmployeeListPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void searchEmployee(String employeeName) {
        driver.findElement(searchField).sendKeys(employeeName);
        driver.findElement(searchButton).click();
    }
}
