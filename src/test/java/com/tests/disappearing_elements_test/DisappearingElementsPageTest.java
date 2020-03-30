package com.tests.disappearing_elements_test;

import com.tests.TestBase;
import org.testng.annotations.Test;

public class DisappearingElementsPageTest extends TestBase {

    @Test
    public void clickLink(){
        driver.get("http://the-internet.herokuapp.com/");
        disappearingElementsPage.clickLink();
    }

//Сделать через Assert

}
