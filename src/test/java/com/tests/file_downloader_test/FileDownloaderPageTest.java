package com.tests.file_downloader_test;

import com.tests.TestBase;
import org.testng.annotations.Test;

public class FileDownloaderPageTest extends TestBase {

    @Test
    public void clickLink(){
        driver.get("http://the-internet.herokuapp.com/");
        fileDownloaderPage.clickLink();
    }

    @Test(dependsOnMethods = "clickLink")
    public void downloadFiles(){
        fileDownloaderPage.downloadFiles();
    }
}
