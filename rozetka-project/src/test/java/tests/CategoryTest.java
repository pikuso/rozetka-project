package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.CategoryPage;
import pages.HomePage;

public class CategoryTest extends BaseTest {

    @Test
    public void userCanOpenCategory() {
        skipIfCloudflare();

        HomePage home = new HomePage();
        home.search("ноутбук");

        CategoryPage category = new CategoryPage();
        category.verifyCategoryOpened("Ноутбуки");
    }
}
