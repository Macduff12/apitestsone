package AmazonPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AmazonSearchResultsPage extends BasePage {
    public AmazonSearchResultsPage(WebDriver driver){
        super(driver);
    }

    public void navigateAmazon() {
        driver.get("https://www.amazon.com/");
    }



    public WebElement actionSearch() {
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        actions.moveToElement(element).perform();
        return element;
    }
    public WebElement getAmazonPageSearch() {
        return driver.findElement((By.xpath("//a[@aria-label='Amazon']")));
    }

    public WebElement clickSearchField() {
        return driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
    }
    public WebElement clickSearchShoes() {
        return driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
    }
    public WebElement clickSearchPhones() {
        return driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
    }
    public WebElement clickSearchBooks() {
        return driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
    }


}
