package com.phptravels.automation.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ClickButton {
    public static void clickJS(WebDriver driver, By by){
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click():", driver.findElements(by));

    }
}
