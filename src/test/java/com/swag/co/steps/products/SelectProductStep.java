package com.swag.co.steps.products;

import com.swag.co.pages.products.SelectProductPage;
import net.serenitybdd.annotations.Step;
import org.openqa.selenium.interactions.Actions;

public class SelectProductStep extends SelectProductPage {

    @Step("Agregar productos al carrito de compras")
    public void addProducts(int quantity){
        for (int i = 0; i < quantity ; i++) {
            Actions act = new Actions(getDriver());
            act.click(products.get(i)).perform();
        }
    }

    @Step("click en el icono de carrito de compras")
        public void clickShoppindCartIcon(){
        shoppingCartIcon.click();
    }
}
