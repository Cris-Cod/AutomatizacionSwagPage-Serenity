package com.swag.co.steps.shopping;

import com.swag.co.pages.shopping.ShoppingCartPages;
import net.serenitybdd.annotations.Step;

public class ShoppingCartStep extends ShoppingCartPages {

    @Step("click en checkout")
    public void clickCheckoutButton(){
        checkoutBtn.click();
    }

    @Step("Ingresar nombre")
    public void typeFirstName(String firtsName){
        txt_firstName.sendKeys(firtsName);
    }

    @Step("Ingresar apellido")
    public void typeLastName(String lastName){
        txt_lastaName.sendKeys(lastName);
    }

    @Step("Ingresar codigo postal")
    public void typePostal(String postal){
        txt_postal.sendKeys(postal);
    }

    @Step("Click en continuar")
    public void clickContinue(){
        btnContinue.click();
    }

    @Step("Click en finalizar")
    public void clickFinish(){
        btnFinish.click();
    }

}
