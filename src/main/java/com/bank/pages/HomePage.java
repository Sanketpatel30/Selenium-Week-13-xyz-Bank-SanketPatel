package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By bankManagerLoginTab = By.xpath("//button[contains(text(),'Bank Manager Login')]");
    By customerLoginTab = By.xpath("//button[contains(text(),'Customer Login')]");

    public void clickOnBankManagerLoginTab() {
        clickOnElement(String.valueOf(bankManagerLoginTab));
    }

    public void clickOnCustomerLoginTab() {
        clickOnElement(String.valueOf(customerLoginTab));
    }
}
