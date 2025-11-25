package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchResultsPage;

public class SearchTest extends BaseTest {

    @Test
    public void userCanSearchProduct() {
        skipIfCloudflare();

        HomePage home = new HomePage();
        home.search("iphone");

        SearchResultsPage results = new SearchResultsPage();
        results.openFirstProduct();
    }
}
