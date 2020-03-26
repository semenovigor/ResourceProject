package com.pages.basic_auth;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.Key;

public class BasicAuthPage {
    @FindBy(xpath = "//h3[text()]")
    protected WebElement basicAuthText;


    public String getText(){
       return basicAuthText.getText();
    }



}
