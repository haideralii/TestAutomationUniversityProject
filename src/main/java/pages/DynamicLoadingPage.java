package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    public DynamicLoadingPage(WebDriver driver){ this.driver = driver; }

    private String ExampleLinkTextFormat = "//a[contains(text(), \"%s\")]";
    private By Example1Link = By.xpath(String.format(ExampleLinkTextFormat, "Example 1:"));

    public DynamicLoadingExample1Page clickDynamicLoadingExample1PageLink(){
        driver.findElement(Example1Link).click();
        return new DynamicLoadingExample1Page(driver);
    }

}
