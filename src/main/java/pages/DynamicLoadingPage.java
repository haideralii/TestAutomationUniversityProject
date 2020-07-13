package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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



}
