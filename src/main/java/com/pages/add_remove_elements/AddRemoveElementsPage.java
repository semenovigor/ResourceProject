package com.pages.add_remove_elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddRemoveElementsPage {

    @FindBy(xpath = "//a[text()=\"Add/Remove Elements\"]")
    protected WebElement addRemoveLink;
    @FindBy(xpath = "//button[text()=\"Add Element\"]")
    protected WebElement addElement;
    @FindBy(xpath = "//button[text()=\"Delete\"]")
    protected WebElement deleteElement;


    public void clickLink(){
        addRemoveLink.click();
    }

    public void clickAddElement(){
        addElement.click();
    }
    public boolean checkButtonOnPage(){
        return addElement.isDisplayed();
    }

    public void addCountElement(int count){
        for (int i=0;i<count;i++){
            clickAddElement();
        }
    }

    public void clickDeleteElement(){
        deleteElement.click();
    }

    public void deleteCountElement(int count) {
        for (; count > 0; count--) {
            clickDeleteElement();
        }
    }
}
