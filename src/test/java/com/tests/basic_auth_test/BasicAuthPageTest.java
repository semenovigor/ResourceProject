package com.tests.basic_auth_test;

import com.tests.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicAuthPageTest extends TestBase {

    @Test
    public void clickLink() {
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");

    }

    @Test(dependsOnMethods = "clickLink")

    public void authorisationSuccess(){
        visibilityLocatedElementWaiter(By.xpath("//h3[text()]"),10);
        Assert.assertEquals(basicAuthPage.getText(),"Basic Auth");

    }
}
