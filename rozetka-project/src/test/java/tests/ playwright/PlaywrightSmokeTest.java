package tests.playwright;

import com.microsoft.playwright.*;
import org.testng.annotations.Test;

public class PlaywrightSmokeTest {

    @Test
    public void openRozetkaCategory() {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions().setHeadless(false)
            );

            Page page = browser.newPage();
            page.navigate("https://rozetka.com.ua/ua/smartphones/c80003/");

            page.waitForTimeout(5000);
        }
    }
}
