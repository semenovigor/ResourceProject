package com.pages.check_boxes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckBoxesPage {
    @FindBy(xpath = "//a[text()=\"Checkboxes\"]")
    protected WebElement checkBoxesLink;
    @FindBy(xpath = "//form[@id=\"checkboxes\"]/input")
    protected List<WebElement> listBoxes;

    public void clickLink(){
        checkBoxesLink.click();
    }

    public void clickBoxes(){
        listBoxes.get(1).click();
        listBoxes.get(2).click();
    }

}
