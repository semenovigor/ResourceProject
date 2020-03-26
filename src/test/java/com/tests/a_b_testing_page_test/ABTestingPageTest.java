package com.tests.a_b_testing_page_test;


import com.pages.a_b_testing_page.ABTestingPage;
import com.tests.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ABTestingPageTest extends TestBase {

    @Test
    public void clickABLink(){
        driver.get("http://the-internet.herokuapp.com/");
        abTestingPage.clickLink();
    }

    @Test(dependsOnMethods = "clickABLink")
    public void checkText(){
        visibilityLocatedElementWaiter(By.xpath("//h3[text()=\"A/B Test Control\"]"),10);
        abTestingPage.checkTextOnPage();
        Assert.assertEquals(abTestingPage.getTextOnPage(), "A/B Test Control");
    }
}
