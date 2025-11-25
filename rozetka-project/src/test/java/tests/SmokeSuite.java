package tests;

import org.testng.annotations.Test;

public class SmokeSuite {

    @Test(groups = "smoke")
    public void smokeSearch() {}

    @Test(groups = "smoke")
    public void smokeCart() {}

    @Test(groups = "smoke")
    public void smokeFilters() {}
}
