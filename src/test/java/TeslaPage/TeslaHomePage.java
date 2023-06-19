package TeslaPage;

import AmazonPage.BasePage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TeslaHomePage extends BasePage {
    public TeslaHomePage(WebDriver driver) {
        super(driver);
    }

    public void navigateTesla() {
        driver.get("https://www.tesla.com/");
    }
    @Test
    public void mainHeader() {
        waitElementToBeVisible("//a[@data-gtm-event='drawer-interaction']").click();
        waitElementToBeVisible("//button[@class='tds-btn models tds-btn tds-btn--large selectedButton']").click();
        waitElementToBeVisible("//button[@data-model='Model3']").click();
        waitElementToBeVisible("//button[@data-model='ModelX']").click();
        waitElementToBeVisible("//button[@data-model='ModelY']").click();
        waitElementToBeVisible("//a[@aria-label='Tesla Logo']").click();
        waitElementToBeVisible("//a[@title='Model S']").click();


    }
}
