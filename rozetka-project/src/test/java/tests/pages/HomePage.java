package tests.pages;

import static com.codeborne.selenide.Selenide.*;

public class HomePage {

    private String searchInput = "input[name='search']";
    private String searchButton = "button.button_color_green";

    public void search(String text) {
        $(searchInput).setValue(text);
        $(searchButton).click();
    }
}
