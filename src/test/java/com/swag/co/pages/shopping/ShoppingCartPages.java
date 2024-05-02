package com.swag.co.pages.shopping;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ShoppingCartPages extends PageObject {

    @FindBy(xpath = "//a[@class='btn_action checkout_button']")
    protected WebElementFacade checkoutBtn;

    @FindBy(id = "first-name")
    protected WebElementFacade txt_firstName;

    @FindBy(id = "last-name")
    protected WebElementFacade txt_lastaName;

    @FindBy(id = "postal-code")
    protected WebElementFacade txt_postal;

    @FindBy(xpath = "//input[@class='btn_primary cart_button']")
    protected WebElementFacade btnContinue;

    @FindBy(xpath = "//a[@class='btn_action cart_button']")
    protected WebElementFacade btnFinish;


}
