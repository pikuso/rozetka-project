package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.pages.CategoryPage;
import tests.pages.ProductPage;
import tests.pages.CartPage;

import static com.codeborne.selenide.Selenide.open;

public class AddToCartTest extends BaseTest {

    @Test
    public void addProductToCart() {

        CategoryPage category = new CategoryPage();
        Assert.assertTrue(category.productsExist(), "There are no products in this category.");

        category.openFirstProduct();

        ProductPage product = new ProductPage();

        Assert.assertFalse(product.getTitle().isEmpty(), "Product name is empty!");

        product.addToCart();

        open("https://rozetka.com.ua/ua/cart/");

        CartPage cart = new CartPage();

        Assert.assertTrue(cart.isCartPageOpened(), "The shopping cart page did not open.");
        Assert.assertTrue(cart.hasProduct(), "The product was not added to the cart!");
    }
}
