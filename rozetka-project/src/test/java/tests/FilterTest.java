package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.CategoryPage;
import pages.FilterPage;
import pages.HomePage;

public class FilterTest extends BaseTest {

    @Test
public void userCanFilterByBrand() {

    skipIfCloudflare();

    HomePage home = new HomePage();
    home.search("смартфон");

    skipIfCloudflare();

    FilterPage filter = new FilterPage();
    filter.applyBrand("Samsung");

    filter.verifyBrandInResults("Samsung");
}

}
