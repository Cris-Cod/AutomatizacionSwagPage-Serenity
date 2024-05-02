package com.swag.co.pages.login;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageObject {
    @FindBy(id = "user-name")
    protected WebElement txt_username;

    @FindBy(id = "password")
    protected WebElement txt_password;

    @FindBy(id = "login-button")
    protected WebElement btn_login;

}
