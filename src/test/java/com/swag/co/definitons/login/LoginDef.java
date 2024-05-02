package com.swag.co.definitons.login;

import com.swag.co.steps.login.LoginStep;
import com.swag.co.steps.validation.ValidationStep;
import com.swag.co.utilities.website.Website;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

import org.junit.Assert;

public class LoginDef {

    @Steps(shared = true)
    Website url;

    @Steps(shared = true)
    LoginStep login;

    @Steps(shared = true)
    ValidationStep validate;

    @Given("el usuario navega al sitio web")
    public void userNavigateTo(){
        url.navigateTo("https://www.saucedemo.com/v1/index.html");
    }

    @When("ingresa credenciales validas")
    public void userLoginWithValidCredential(){
        login.typeUserName("standard_user");
        login.typePassword("secret_sauce");
        login.clickLogin();
    }

    @Then("la aplicacion deberia mostrar el moodulo principal de productos")
    public void systemShowProductModule(){
        Assert.assertTrue(validate.titleIsVisible());
    }

    @When("ingresa credenciales invalidas")
    public void userLoginWithInvalidCredential(){
        login.typeUserName("standard_user");
        login.typePassword("123456");
        login.clickLogin();
    }

    @Then("la aplicacion deberia mostrar un mensaje de error")
    public void systemShowErrorMessage(){
        Assert.assertTrue(validate.errorMessageIsDisplayed());
    }
}
