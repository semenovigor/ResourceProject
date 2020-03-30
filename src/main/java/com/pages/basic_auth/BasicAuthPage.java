package com.pages.basic_auth;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasicAuthPage {
    @FindBy(xpath = "//h3[text()]")
    protected WebElement basicAuthText;


    public String getText(){
       return basicAuthText.getText();
    }



}
