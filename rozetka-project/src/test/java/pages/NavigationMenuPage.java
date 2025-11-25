package pages;

import static com.codeborne.selenide.Selenide.$;

public class NavigationMenuPage {

    public void openSection(String name) {
        $("a[href*='" + name.toLowerCase().replace(" ", "-") + "']").click();
    }

    public void verifySection(String name) {
        $("h1").shouldHave(com.codeborne.selenide.Condition.text(name));
    }
}
