package com.tests.context_menu_test;

import com.tests.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ContextMenuPageTest extends TestBase {


    @Test
    public void clickLink(){
        driver.get("http://the-internet.herokuapp.com/");
        contextMenuPage.clickLink();
    }

    @Test(dependsOnMethods = "clickLink")
    public void rightClick(){
        Actions actions = new Actions(driver);
        actions.contextClick(contextMenuPage.getContextMenu()).perform();
    }

    @Test(dependsOnMethods = "rightClick")
    public void acceptAlertMassage(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

}
