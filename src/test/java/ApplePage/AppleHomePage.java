package ApplePage;

import AmazonPage.BasePage;
import org.openqa.selenium.WebDriver;

public class AppleHomePage extends BasePage {
    public AppleHomePage(WebDriver driver) {
        super(driver);
    }
    public void navigateApple() {
        driver.get("https://www.apple.com/ua/");
    }
    public boolean mainHeader(){
        waitElementToBeVisible("//span[@class='globalnav-link-text-container']").click();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitElementToBeVisible("//li[@class='chapternav-item chapternav-item-macbook-air']").click();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitElementToBeVisible("//a[@data-analytics-title='macbook air m1']").click();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitElementToBeVisible("//a[@class='globalnav-link globalnav-link-apple']").click();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitElementToBeVisible("//a[@data-globalnav-item-name='apple']").click();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitElementToBeVisible("//a[@data-globalnav-item-name='ipad']").click();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitElementToBeVisible("//li[@class='chapternav-item chapternav-item-ipad-pro']").click();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitElementToBeVisible("//a[@data-analytics-title='why-ipad']").click();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitElementToBeVisible("//a[@data-analytics-title='specs']").click();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return false;
    }



}
