package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {
    private WebDriver driver;
    public FramesPage(WebDriver driver){ this.driver = driver; }

    private By _nestedFramesLink = By.linkText("Nested Frames");

    public NestedFramesPage ClickOnNestedFramesLink(){
        driver.findElement(_nestedFramesLink).click();
        return new NestedFramesPage(driver);
    }

}
