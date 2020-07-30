package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DynamicLoadingPage {
    private WebDriver driver;
    public DynamicLoadingPage(WebDriver driver){ this.driver = driver; }

    private String ExampleLinkTextFormat = "//a[contains(text(), \"%s\")]";
    private By Example1Link = By.xpath(String.format(ExampleLinkTextFormat, "Example 1:"));

    private String Example2LinkTextFormat = "//a[contains(text(), \"%s\")]";
    private By Example2Link = By.xpath(String.format(Example2LinkTextFormat, "Example 2:"));

    public DynamicLoadingExample1Page clickDynamicLoadingExample1PageLink(){
        driver.findElement(Example1Link).click();
        return new DynamicLoadingExample1Page(driver);
    }

    public DynamicLoadingExample2Page clickDynamicLoadingExample2PageLink(){
        driver.findElement(Example2Link).click();
        return new DynamicLoadingExample2Page(driver);
    }

    public DynamicLoadingExample2Page OpenLinkInNewTab(){


        // Using Action to Perform cntrl+click
/*        Actions actions = new Actions(driver);
        actions.keyDown(Keys.LEFT_CONTROL)
                .click(driver.findElement(Example2Link))
                .keyUp(Keys.LEFT_CONTROL)
                .build()
                .perform();*/

        // Using Send keys to perform cntl+click
        driver.findElement(Example2Link).sendKeys(Keys.CONTROL, Keys.ENTER);

        return new DynamicLoadingExample2Page(driver);
    }




}
