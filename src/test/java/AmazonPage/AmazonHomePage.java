package AmazonPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class AmazonHomePage  extends BasePage {

    Actions actions = new Actions(driver);

    public AmazonHomePage(WebDriver driver) {
        super(driver);
    }

    public void navigateAmazon() {
        driver.get("https://www.amazon.com/");
    }


    public WebElement actionMoveToElementTestAmazonn() {
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
        actions.moveToElement(element).perform();
        return element;
    }

    public void actionClickAmazon() { //a[@id='nav-global-location-popover-link']

    }
    public void actionMoveToElementTestAmazon(){
        actions.moveToElement(waitElementToBeVisible("//a[@id='nav-logo-sprites']"));
    }

    public WebElement actionDoubleClickAmazon() {
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//button[@name='glowDoneButton']"));
        actions.click(element).perform();
        return element;
    }
    public WebElement getCart () {
        return driver.findElement((By.xpath("//a[@class='nav-a nav-a-2 nav-progressive-attribute']")));
    }
    public WebElement getAmazonPage() {
        return driver.findElement((By.xpath("//a[@aria-label='Amazon']")));
    }
    public WebElement clickKeyBoard() {
        return driver.findElement((By.xpath("//img[@data-a-hires='https://images-na.ssl-images-amazon.com/images/G/01/AmazonExports/Fuji/2021/June/Fuji_Quad_Keyboard_2x._SY232_CB667159063_.jpg']")));
    }

}