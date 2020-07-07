package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressPage {
    private WebDriver driver;
    public KeyPressPage(WebDriver driver){ this.driver = driver; }

    private By _target = By.id("target");
    private By _result = By.id("result");

    public void EnterText(String text){
        driver.findElement(_target).sendKeys(text);
    }

    public String getResult(){
        return driver.findElement(_result).getText();
    }

    public String getResultFromTargetField(){
        return driver.findElement(_target).getText();
    }


    public void EnterPi(){
        driver.findElement(_target).sendKeys(Keys.chord(Keys.ALT + "p") + "=3.14");
    }
}
