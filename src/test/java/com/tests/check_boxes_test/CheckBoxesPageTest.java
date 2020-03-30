package com.tests.check_boxes_test;

import com.tests.TestBase;
import org.testng.annotations.Test;

public class CheckBoxesPageTest extends TestBase {

    @Test
    public void clickLink(){
        driver.get("http://the-internet.herokuapp.com/");
        checkBoxesPage.clickLink();

    }

    @Test(dependsOnMethods = "clickLink")
    public void checkBoxIsSelectedorEnabled() throws InterruptedException {
        checkBoxesPage.checkIsSelectedorEnabled();
    }
}
