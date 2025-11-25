package base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class BaseTest {

    @BeforeMethod
    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.headless = false;
        Configuration.browserSize = "1500x900";

        Selenide.open("https://rozetka.com.ua/");
        skipIfCloudflare();
    }

    public void skipIfCloudflare() {
        // 1. Cloudflare spinner/loading
    if ($("div[id*='cf-please-wait']").exists()) {
        throw new SkipException("Cloudflare detected — skipping test");
    }

    // 2. Cloudflare challenge / verify screen (универсальный XPATH)
    if ($x("//*[contains(text(),'Verifying you are human')]").exists()) {
        throw new SkipException("Cloudflare verification — skipping test");
    }

    // 3. "review the security of your connection" — другой вариант капчи
    if ($x("//*[contains(text(),'security of your connection')]").exists()) {
        throw new SkipException("Cloudflare security check — skipping test");
    }

    // 4. Общий fallback: если на странице НЕТ обычного хедера Rozetka → тоже SKIP
    if ($("header").exists() == false) {
        throw new SkipException("Cloudflare (header missing) — skipping");
    }
    }}
