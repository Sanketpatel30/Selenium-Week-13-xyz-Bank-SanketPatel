package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {
    By depositTab = By.xpath("//button[@ng-click='deposit()']");
    By amountField = By.xpath("//input[@ng-model='amount']");
    By depositButton = By.xpath("//button[text()='Deposit']");
    By depositMsg = By.xpath("//span[text()='Deposit Successful']");
    By withdrawTab = By.xpath("//button[@ng-click='withdrawl()']");
    By withdrawButton = By.xpath("//button[text()='Withdraw']");
    By withdrawMsg = By.xpath("//span[text()='Transaction Successful']");

    public void clickOnDepositTab() {
        clickOnElement(String.valueOf(depositTab));
    }

    public void enterAmountToDeposit(String text) {
        sendTextToElement(amountField, text);
    }

    public void clickOnDepositButton() {
        clickOnElement(String.valueOf(depositButton));
    }

    public String getDepositMsg() {
        return getTextFromElement(depositMsg);
    }

    public void clickOnWithdrawTab() {
        clickOnElement(String.valueOf(withdrawTab));
    }

    public void enterAmountToWithdraw(String text) {
        sendTextToElement(amountField, text);
    }

    public void clickOnWithdrawButton() {
        clickOnElement(String.valueOf(withdrawButton));
    }

    public String getWithdrawMsg() {
        return getTextFromElement(withdrawMsg);
    }
}
