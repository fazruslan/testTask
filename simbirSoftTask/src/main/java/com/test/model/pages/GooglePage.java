package com.test.model.pages;

import com.test.utils.Webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GooglePage {

    private WebDriver driver;

    private By searchFieldSelector = By.name("q");

    public String pageUrl = "https://google.com";

    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement searchField() {
        return driver.findElement(searchFieldSelector);
    }

    public void submitSearchButton(WebElement searchField) {
        WebDriverWait w = new WebDriverWait(driver, 5);
        w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul")));
        searchField.submit();
    }

}
