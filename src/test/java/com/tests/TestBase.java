package com.tests;

import com.pages.a_b_testing_page.ABTestingPage;
import com.pages.add_remove_elements.AddRemoveElementsPage;
import com.pages.basic_auth.BasicAuthPage;
import com.pages.broken_images.BrokenImagesPage;
import com.pages.check_boxes.CheckBoxesPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;

public class TestBase {
    protected static WebDriver driver;

    protected ABTestingPage abTestingPage = PageFactory.initElements(getDriver(), ABTestingPage.class);
    protected AddRemoveElementsPage addRemoveElementsPage = PageFactory.initElements(getDriver(), AddRemoveElementsPage.class);
    protected BrokenImagesPage brokenImagesPage = PageFactory.initElements(getDriver(), BrokenImagesPage.class);
    protected BasicAuthPage basicAuthPage = PageFactory.initElements(getDriver(), BasicAuthPage.class);
    protected CheckBoxesPage checkBoxesPage = PageFactory.initElements(getDriver(),CheckBoxesPage.class);


    public WebDriver getDriver() {
        if(driver==null){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Igor\\IdeaProjects\\ResourseProjectBySelenium\\src\\main\\resources\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();

        }
        return  driver;
    }

    protected void visibilityLocatedElementWaiter(By by, Integer time) {
        new WebDriverWait(driver, time).until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    protected void visibilityAlertWaiter(Alert alert) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.alertIsPresent());
    }


    @AfterSuite
    public void quitGoogle(){
        driver.quit();
    }

}

