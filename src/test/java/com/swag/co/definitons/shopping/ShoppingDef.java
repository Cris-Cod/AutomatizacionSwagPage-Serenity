package com.swag.co.definitons.shopping;

import com.swag.co.steps.products.SelectProductStep;
import com.swag.co.steps.shopping.ShoppingCartStep;
import com.swag.co.steps.validation.ValidationStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class ShoppingDef {
    @Steps(shared = true)
    SelectProductStep selectProduct;

    @Steps(shared = true)
    ValidationStep validate;
    @Steps(shared = true)
    ShoppingCartStep shopping;

    @And("agrega productos al carrito de compras")
    public void userAddProducts(){
        selectProduct.addProducts(3);
    }

    @And("da click en el icono del carrito")
    public void userClickShoppingCartIcon(){
        selectProduct.clickShoppindCartIcon();
    }

    @Then("el sistema deberia listar los productos agregados en el carrito de compras")
    public void systemListProducts(){
        Assert.assertTrue(validate.productsAreDisplayed());
    }

    @Then("el sistema deberia listar la cesta sin productos")
    public void systemShowEmptyShoppingCart(){
        Assert.assertTrue(validate.shopingCartIsEmpy());
    }

    @When("completa todo el registro de la orden")
    public void userCompletOrder(){
        shopping.clickCheckoutButton();
        shopping.typeFirstName("Andres");
        shopping.typeLastName("Ary");
        shopping.typePostal("Co 02");
        shopping.clickContinue();
        shopping.clickFinish();
    }

    @Then("el sistema deberia procesar la compra")
    public void systemProcessShoppingCart(){
        Assert.assertTrue(validate.orderTextIsDisplayed());
    }

}
