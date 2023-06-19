package ApplePage;

import AmazonPage.BasePage;
import org.openqa.selenium.WebDriver;

public class AppleSearchResults extends BasePage {
    public AppleSearchResults(WebDriver driver) {
        super(driver);
    }
    public void navigateApple() {
        driver.get("https://www.apple.com/ua/");
    }

    public boolean getSearchField(){
        waitElementToBeVisible("//a[@id='globalnav-menubutton-link-search']").click();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitElementToBeVisible("//input[@class='globalnav-searchfield-input']").sendKeys("iphone\n");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitElementToBeVisible("//button[@class='globalnav-searchfield-submit']").click();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitElementToBeVisible("//a[@id='support']").click();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitElementToBeVisible("//button[@id='reset']").click();
        waitElementToBeVisible("//input[@id='search-input']").sendKeys("AirPods");
        waitElementToBeVisible("//button[@style='background-color: transparent; border-width: 0px; box-sizing: content-box; color: inherit; cursor: pointer; line-height: inherit; vertical-align: inherit;']").click();
        waitElementToBeVisible("//a[@data-globalnav-item-name='apple']").click();
        return false;
    }
}
