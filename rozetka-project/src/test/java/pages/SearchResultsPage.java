package pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$;

public class SearchResultsPage {

    private final ElementsCollection products = $$("span.goods-tile__title");

    public void openFirstProduct() {
        products.first().click();
    }
}
