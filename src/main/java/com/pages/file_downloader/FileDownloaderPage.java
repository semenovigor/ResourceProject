package com.pages.file_downloader;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FileDownloaderPage {
    @FindBy(xpath = "//div[@class=\"example\"]/a")
    protected List<WebElement> filesDownload;
    @FindBy(xpath = "//a[text()=\"File Download\"]")
    protected WebElement fileDownloaderLink;

    public void clickLink(){
        fileDownloaderLink.click();
    }

    public void downloadFiles(){
        for(WebElement files: filesDownload){
            files.click();
            System.out.println(files.getText());
        }
    }
}
