package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingExample2Page {
    private WebDriver driver;
    public DynamicLoadingExample2Page(WebDriver driver){ this.driver = driver; }

    private By _startButton = By.cssSelector("#start button");
    private By _loader = By.id("loading");
    private By _loaded = By.id("finish");

    public void ClickOnStartButton(){
        driver.findElement(_startButton).click();

/*        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf())*/

        //Fluent Wait
        FluentWait wait = new FluentWait(driver)
                        .withTimeout(Duration.ofSeconds(10))
                        .pollingEvery(Duration.ofSeconds(2))
                        .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.presenceOfElementLocated(_loaded));

    }

    public String GetFinishText(){
       return driver.findElement(_loaded).getText();
    }


}
