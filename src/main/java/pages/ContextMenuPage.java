package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;
    public ContextMenuPage(WebDriver driver){ this.driver = driver; }

    private By _hotspotBox = By.id("hot-spot");

    public void FindTheLocationBox(){

        WebElement _box =  driver.findElement(_hotspotBox);
        Actions actions = new Actions(driver);
        actions.moveToElement(_box).contextClick().perform();
    }

    public String getTextFromContextAlert(){
        return driver.switchTo().alert().getText();
    }

    public void AcceptContextAlert(){
        driver.switchTo().alert().accept();
    }

}
