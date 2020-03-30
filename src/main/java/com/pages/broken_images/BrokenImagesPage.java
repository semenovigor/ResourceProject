package com.pages.broken_images;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



import java.util.List;

public class BrokenImagesPage {
    @FindBy(xpath = "//a[text()=\"Broken Images\"]")
    protected WebElement addRemoveLink;
    @FindBy(xpath = "//div[@class=\"example\"]/img")
    protected List<WebElement> imagesList;

    public int countImagesPage() {
        return imagesList.size();
    }

    public void clickkLink() {
        addRemoveLink.click();
    }
    static int brokenImage = 0;
    public int validateInvalidImages() {
        try {
            System.out.println("Найдено по тэгу " + countImagesPage());
            for (WebElement imgElement : imagesList) {
                if (imgElement != null) {
                    verifyimageActive(imgElement);

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println(brokenImage);
        return brokenImage;
    }
    public void verifyimageActive(WebElement imgElement) {
        try {

            HttpClient client = HttpClientBuilder.create().build();
            HttpGet request = new HttpGet(imgElement.getAttribute("src"));
            HttpResponse response = client.execute(request);

            if (response.getStatusLine().getStatusCode() != 200) {
                System.out.println("broken image");
                brokenImage++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}




