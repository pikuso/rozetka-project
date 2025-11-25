package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.*;

public class ProductTest extends BaseTest {

    @Test
    public void userCanAddProductToCart() {

        skipIfCloudflare();

        HomePage home = new HomePage();
        home.search("iphone 15");

        SearchResultsPage results = new SearchResultsPage();
        results.openFirstProduct();

        ProductPage product = new ProductPage();
        String title = product.getTitle();

        product.addToCart();
        product.goToCart();

        CartPage cart = new CartPage();
        String cartItem = cart.getItemTitle();

        assert cartItem.contains(title.split(" ")[0]);
    }
}
