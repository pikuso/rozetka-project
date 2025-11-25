package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class FilterPage {

    private SelenideElement brandCheckbox(String brand) {
        return $x("//label[contains(., '" + brand + "')]");
    }

    private ElementsCollection productTitles = $$("span.goods-tile__title");

    public void applyBrand(String brand) {
        brandCheckbox(brand).scrollTo().click(); // ← работает на Rozetka
    }

    public void verifyBrandInResults(String brand) {
        productTitles.first().shouldBe(visible);
        for (SelenideElement item : productTitles) {
            item.shouldHave(text(brand));
        }
    }
}
