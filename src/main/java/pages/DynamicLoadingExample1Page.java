package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingExample1Page {
    private WebDriver driver;
    public DynamicLoadingExample1Page(WebDriver driver){ this.driver = driver; }

    private By _startButton = By.cssSelector("#start button");
    private By _loader = By.id("loading");
    private By _loaded = By.id("finish");

    public void ClickStartButton(){
        driver.findElement(_startButton).click();

        // Explicit wait
/*        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(_loader)));*/

        // Fluent Waits

        FluentWait wait = new FluentWait(driver)
                        .withTimeout(Duration.ofSeconds(5))
                        .pollingEvery(Duration.ofSeconds(2))
                        .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(_loader)));

    }

    public String GetLoadedText(){
        return driver.findElement(_loaded).getText();
    }

}
