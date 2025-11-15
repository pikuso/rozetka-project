package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.pages.CategoryPage;

public class CategoryTest extends BaseTest {

    @Test
    public void checkProductsVisible() {
        CategoryPage page = new CategoryPage();
        Assert.assertTrue(page.productsExist(), "Нет товаров на странице");
    }
}
