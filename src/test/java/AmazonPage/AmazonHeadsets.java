package AmazonPage;

import org.openqa.selenium.WebDriver;

public class AmazonHeadsets extends BasePage {
    public AmazonHeadsets(WebDriver driver) {
        super(driver);
    }
    public void navigateAmazon() {
        driver.get("https://www.amazon.com/");
    }

    public void getSearchField(){
        waitElementToBeVisible("//input[@name='field-keywords']").sendKeys("gaming headsets");
        waitElementToBeVisible("//input[@id='nav-search-submit-button']").click();
    }
    public void moveToAll () {
        waitElementToBeVisible("//a[@id='nav-hamburger-menu']");;
    }
    public void clickToAll () {
        waitElementToBeVisible("//a[@id='nav-hamburger-menu']").click();
        waitElementToBeVisible("//a[@data-menu-id='2']").click();
        waitElementToBeVisible("//div[@class='nav-sprite hmenu-close-icon']").click();
        waitElementToBeVisible("//a[@aria-label='Amazon']").click();
    }

}
