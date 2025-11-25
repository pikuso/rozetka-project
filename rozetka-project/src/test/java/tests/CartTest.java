package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.*;

public class CartTest extends BaseTest {

    @Test
    public void userCanRemoveProductFromCart() {
        skipIfCloudflare();

        HomePage home = new HomePage();
        home.search("пылесос");

        SearchResultsPage results = new SearchResultsPage();
        results.openFirstProduct();

        ProductPage product = new ProductPage();
        product.addToCart();
        product.goToCart();

        CartPage cart = new CartPage();
        cart.removeFirstItem();
    }
}
