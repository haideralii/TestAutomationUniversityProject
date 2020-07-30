package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeDeepDOMPage {
    private WebDriver driver;
    public LargeDeepDOMPage(WebDriver driver) {
        this.driver = driver;
    }

    private By _largeTable = By.id("large-table");

    public void FindLargeTable(){
        WebElement _table = driver.findElement(_largeTable);
        String _script = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(_script, _table);
    }

}
