package com.pages.disappearing_elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DisappearingElementsPage {
    @FindBy(xpath = "//a[text()=\"Disappearing Elements\"]")
    protected WebElement disappearingElementsLink;
    @FindBy(xpath = "//ul/li/a[text()=\"Gallery\"]")
    protected WebElement galleryElement;


    public void clickLink(){
        disappearingElementsLink.click();
    }

    public WebElement getGalleryElement() {
        return galleryElement;
    }
}
