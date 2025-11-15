package tests.pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$;

public class CategoryPage {

    private ElementsCollection titles = $$("a.tile-title");

    public boolean productsExist() {
        return titles.size() > 0;
    }
    public void openFirstProduct() {
        titles.first().click();
    }
    
}
