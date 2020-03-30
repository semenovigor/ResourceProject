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


    public void checkIsSelectedorEnabled() throws InterruptedException {
        for (WebElement list: listBoxes){
            if(list.isSelected()){
                list.click();
                Thread.sleep(2000);
            }
            if(!list.isSelected()){
                list.click();
                Thread.sleep(2000);
            }
        }
    }

}
