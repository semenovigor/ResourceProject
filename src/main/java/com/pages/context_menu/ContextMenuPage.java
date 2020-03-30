package com.pages.context_menu;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class ContextMenuPage {
    @FindBy(xpath = "//a[text()=\"Context Menu\"]")
    protected WebElement contextMenuLink;
    @FindBy(xpath = "//div[@id = \"hot-spot\"]")
    protected WebElement contextMenu;


    public void clickLink(){
        contextMenuLink.click();
    }

    public WebElement getContextMenu() {
        return contextMenu;
    }


}
