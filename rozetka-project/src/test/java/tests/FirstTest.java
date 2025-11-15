package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class FirstTest {

    @Test
    public void openRozetkaHomePage() {
        Configuration.browserSize = "1920x1080";

        open("https://rozetka.com.ua/");
        $("body").shouldBe(visible);
    }
}
