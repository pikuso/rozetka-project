package tests.pages;

import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.SelenideElement;

public class CartPage {

    private SelenideElement cartTitle = $("rz-cart-products h1");
    private SelenideElement productInCart = $("div.cart-product");

    public boolean isCartPageOpened() {
        return cartTitle.exists() || productInCart.exists();
    }

    public boolean hasProduct() {
        return productInCart.exists();
    }
}
