package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {

    private WebDriver driver;

    // Locators
    private By profileMenu = By.cssSelector("img[class='oxd-userdropdown-img']");
    private By logoutButton = By.xpath("//a[text()='Logout']");

    // Constructor
    public LogoutPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods for Actions
    public void clickProfileMenu() {
        driver.findElement(profileMenu).click();
    }

    public void clickLogout() {
        driver.findElement(logoutButton).click();
    }
}
