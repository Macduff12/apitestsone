package ApplePage;

import AmazonPage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class AppleIphoneInfo extends BasePage {
    public AppleIphoneInfo(WebDriver driver) {
        super(driver);
    }
    public void navigateApple() {
        driver.get("https://www.apple.com/ua/");
    }
    Actions actions = new Actions(driver);
    public boolean getAppleIphoneInfo(){
        waitElementToBeVisible("//a[@data-globalnav-item-name='iphone']").click();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitElementToBeVisible("//li[@class='chapternav-item chapternav-item-iphone-14']").click();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
        waitElementToBeVisible("//a[@data-globalnav-item-name='iphone']").click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitElementToBeVisible("//li[@class='chapternav-item chapternav-item-iphone-13']").click();

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitElementToBeVisible("//a[@data-globalnav-item-name='apple']").click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitElementToBeVisible("//a[@class='icon icon-after icon-chevronright']").click();

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitElementToBeVisible("//a[@data-globalnav-item-name='iphone']").click();

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitElementToBeVisible("//li[@class='chapternav-item chapternav-item-iphone-se']").click();

        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return false;
    }



}
