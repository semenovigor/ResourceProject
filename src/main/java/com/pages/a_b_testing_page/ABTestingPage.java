package com.pages.a_b_testing_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ABTestingPage {

    @FindBy(xpath = "//a[text()=\"A/B Testing\"]")
    protected WebElement abLink;
    @FindBy(xpath = "//h3[text()=\"A/B Test Control\"]")
    protected WebElement textOnPage;

    public void clickLink() {
        abLink.click();
    }


    public void checkTextOnPage(){
        textOnPage.isDisplayed();
    }


    public String getTextOnPage(){
        return textOnPage.getText();
    }
}
