package com.tests.broken_images_test;

import com.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrokenImagesPageTest extends TestBase {

    @Test
    public void clickLink(){
        driver.get("http://the-internet.herokuapp.com/");
        brokenImagesPage.clickkLink();
    }

    @Test(dependsOnMethods = "clickLink")
    public void brokenImages(){
       Assert.assertEquals(brokenImagesPage.validateInvalidImages(), 2);
    }
}
