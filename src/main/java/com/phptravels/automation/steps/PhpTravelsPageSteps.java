package com.phptravels.automation.steps;

import com.phptravels.automation.models.DataInjection;
import com.phptravels.automation.pageobjects.PhpTravelsPage;
import com.phptravels.automation.ui.ClickButton;
import net.thucydides.core.annotations.Step;


public class PhpTravelsPageSteps {
    PhpTravelsPage phpTravelsPage = new PhpTravelsPage();
    DataInjection dataInjection = new DataInjection();

    @Step
    public void openBrowser(){
        phpTravelsPage.open();
    }

    @Step
    public void fillFieldsInPhpTravelsPage() {
        phpTravelsPage.sendEmail(dataInjection.getEmail());
        phpTravelsPage.sendPassword(dataInjection.getPassword());
        //ClickButton.clickJS(phpTravelsPage.getDriver(),phpTravelsPage.LoginButton);
    }

}
