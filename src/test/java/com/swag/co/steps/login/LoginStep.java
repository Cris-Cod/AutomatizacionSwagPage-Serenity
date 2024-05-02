package com.swag.co.steps.login;

import com.swag.co.pages.login.LoginPage;
import net.serenitybdd.annotations.Step;


public class LoginStep extends LoginPage {

    @Step("Ingresar usuario")
    public void typeUserName(String username){
        txt_username.sendKeys(username);
    }

    @Step("Ingresar contraseña")
    public void typePassword(String password){
        txt_password.sendKeys(password);
    }

    @Step("click en el boton login")
    public void clickLogin(){
        btn_login.click();
    }

}
