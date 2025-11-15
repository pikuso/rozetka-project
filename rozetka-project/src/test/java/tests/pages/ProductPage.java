package tests.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ProductPage {

    private SelenideElement title = $("h1.product__title");
    private SelenideElement price = $("p.product-price__big");
    private SelenideElement buyButton = $("button.buy-button");

    public String getTitle() {
        return title.getText().trim();
    }

    public String getPrice() {
        return price.getText().trim();
    }

    public void addToCart() {
        buyButton.click();
    }
}
