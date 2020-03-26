package com.tests.add_remove_elements_test;

import com.tests.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddRemoveElementsPageTest extends TestBase {

    @Test
    public void clickLink(){
        driver.get("http://the-internet.herokuapp.com/");
        addRemoveElementsPage.clickLink();
    }

    @Test(dependsOnMethods = "clickLink")
    public void addElements() {
        Assert.assertTrue(addRemoveElementsPage.checkButtonOnPage());
        addRemoveElementsPage.addCountElement(30);

    }

    @Test(dependsOnMethods = "addElements")
    public void deleteElements() throws InterruptedException {
        addRemoveElementsPage.deleteCountElement(29);
        Thread.sleep(5000);
    }

}
