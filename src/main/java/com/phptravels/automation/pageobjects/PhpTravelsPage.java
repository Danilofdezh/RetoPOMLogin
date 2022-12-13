package com.phptravels.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.phptravels.net/login")
public class PhpTravelsPage extends PageObject {

    public By EmailInput = By.name("email");
    public By PasswordInput = By.name("password");
    public By LoginButton = By.xpath("//*[@id='fadein']/div[3]/div/div[2]/div[2]/div/form/div[3]/button");

    public void sendEmail (String string){
        getDriver().findElement(EmailInput).sendKeys(string);
    }
    public void sendPassword (String string){ getDriver().findElement(PasswordInput).sendKeys(string); }
    public void sendLogin(){ getDriver().findElement(LoginButton).submit();
    }
}
