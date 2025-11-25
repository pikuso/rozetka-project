package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.NavigationMenuPage;

public class NavigationTest extends BaseTest {

    @Test
    public void userCanNavigate() {
        skipIfCloudflare();

        NavigationMenuPage nav = new NavigationMenuPage();
        nav.openSection("Бытовая техника");
        nav.verifySection("Бытовая техника");
    }
}
