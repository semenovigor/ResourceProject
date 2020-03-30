package com.tests.drag_and_drop_test;

import com.tests.TestBase;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropPageTest extends TestBase {

    @Test
    public void clickLink(){
        driver.get("http://the-internet.herokuapp.com/");
        dragAndDropPage.clickLink();
    }

    @Test(dependsOnMethods = "clickLink")
    public void dragAndDrop(){
        Actions actions = new Actions(driver);
        actions.dragAndDrop(dragAndDropPage.getColumnB(), dragAndDropPage.getColumnA()).build().perform();
    }

}
