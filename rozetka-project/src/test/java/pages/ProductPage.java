package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ProductPage {

    private final SelenideElement title = $("h1.product__title");
    private final SelenideElement buyButton = $("button.buy-button");
    private final SelenideElement cartButton = $("rz-shopping-cart");

    public String getTitle() {
        return title.getText();
    }

    public void addToCart() {
        buyButton.click();
    }

    public void goToCart() {
        cartButton.click();
    }
}
