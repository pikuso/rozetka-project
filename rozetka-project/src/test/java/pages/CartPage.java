package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CartPage {

    private final SelenideElement cartItemTitle = $(".cart-product__title");
    private final SelenideElement clearCartBtn = $("button.cart-clear");

    public String getItemTitle() {
        return cartItemTitle.getText();
    }

    public void removeFirstItem() {
        clearCartBtn.click();
    }

    public void verifyCartIsEmpty() {
        $(".cart-empty").shouldHave();
    }
}
