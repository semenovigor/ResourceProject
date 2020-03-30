package com.pages.drag_and_drop;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DragAndDropPage {
    @FindBy(xpath = "//a[text()=\"Drag and Drop\"]")
    protected WebElement dragAndDropLink;
    @FindBy(id = "column-a")
    protected WebElement columnA;
    @FindBy(id = "column-b")
    protected WebElement columnB;


    public void clickLink(){
        dragAndDropLink.click();
    }

    public WebElement getColumnA() {
        return columnA;
    }

    public WebElement getColumnB() {
        return columnB;
    }
}
