package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    private final SelenideElement searchInput = $("input[name='search']");
    private final SelenideElement searchButton = $("button.button_color_green");

    public void search(String text) {
        searchInput.setValue(text);
        searchButton.click();
    }
}
