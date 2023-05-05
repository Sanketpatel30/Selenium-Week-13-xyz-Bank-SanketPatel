package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {
    By addCustomerTab = By.xpath("//button[@ng-click='addCust()']");
    By openAccountTab = By.xpath("//button[@ng-click='openAccount()']");
    By customersTab = By.xpath("//button[@ng-click='showCust()']");

    public void clickOnAddCustomerTab() {
        clickOnElement(String.valueOf(addCustomerTab));
    }

    public void clickOnOpenAccountTab() {
        clickOnElement(String.valueOf(openAccountTab));
    }

    public void clickOnCustomers() {
        clickOnElement(String.valueOf(customersTab));
    }

    public String getPopupMsg() {
        return getTextFromAlert();
    }

    public void clickOKOnPopup() {
        acceptAlert();
    }
}
