package pages;

import static com.codeborne.selenide.Selenide.$;

public class CategoryPage {

    public void verifyCategoryOpened(String name) {
        $("h1").shouldHave(com.codeborne.selenide.Condition.text(name));
    }

    public void applyBrandFilter(String brand) {
        $("[data-id='" + brand + "']").click();
    }
}
