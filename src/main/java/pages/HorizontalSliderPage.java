package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.security.Key;

public class HorizontalSliderPage {
    private WebDriver driver;
    public HorizontalSliderPage(WebDriver driver){ this.driver = driver; }

    private By _slider = By.xpath("//input[@type='range']");
    private By _range = By.xpath("//span[@id='range']");

    public String getRangeText(){
        return driver.findElement(_range).getText();
    }

    public void clickOnHorizontalSlider(){
        driver.findElement(_slider).click();
    }

    public void PassKeyToSlider(String value) {
        String _rangeNumber = driver.findElement(_range).getText();

        while (!getRangeText().equals(value)) {
            driver.findElement(_slider).sendKeys(Keys.ARROW_RIGHT);
        }


        // Other way in which we will user if else to perform the function
        /*
        if (_rangeNumber.equals("0")) {
            driver.findElement(_slider)
                    .sendKeys(Keys.chord(Keys.ARROW_RIGHT) + Keys.ARROW_RIGHT + Keys.ARROW_RIGHT
                            + Keys.ARROW_RIGHT + Keys.ARROW_RIGHT + Keys.ARROW_RIGHT + Keys.ARROW_RIGHT + Keys.ARROW_RIGHT);
        }
        else if (_rangeNumber.equals("0.5")){
            driver.findElement(_slider)
                    .sendKeys(Keys.chord(Keys.ARROW_RIGHT) + Keys.ARROW_RIGHT + Keys.ARROW_RIGHT
                            + Keys.ARROW_RIGHT + Keys.ARROW_RIGHT + Keys.ARROW_RIGHT + Keys.ARROW_RIGHT );
        }
        else if (_rangeNumber.equals("1")){
            driver.findElement(_slider)
                    .sendKeys(Keys.chord(Keys.ARROW_RIGHT) + Keys.ARROW_RIGHT + Keys.ARROW_RIGHT
                            + Keys.ARROW_RIGHT + Keys.ARROW_RIGHT + Keys.ARROW_RIGHT);
        }
        else if (_rangeNumber.equals("1.5")){
            driver.findElement(_slider)
                    .sendKeys(Keys.chord(Keys.ARROW_RIGHT) + Keys.ARROW_RIGHT + Keys.ARROW_RIGHT
                            + Keys.ARROW_RIGHT + Keys.ARROW_RIGHT);
        }
        else if (_rangeNumber.equals("2")){
            driver.findElement(_slider)
                    .sendKeys(Keys.chord(Keys.ARROW_RIGHT) + Keys.ARROW_RIGHT + Keys.ARROW_RIGHT + Keys.ARROW_RIGHT) ;
        }
        else if (_rangeNumber.equals("2.5")){
            driver.findElement(_slider)
                    .sendKeys(Keys.chord(Keys.ARROW_RIGHT) + Keys.ARROW_RIGHT + Keys.ARROW_RIGHT) ;
        }
        else if (_rangeNumber.equals("3")){
            driver.findElement(_slider)
                    .sendKeys(Keys.chord(Keys.ARROW_RIGHT) + Keys.ARROW_RIGHT) ;
        }
        else if (_rangeNumber.equals("3.5")){
            driver.findElement(_slider)
                    .sendKeys(Keys.chord(Keys.ARROW_RIGHT)) ;
        }
        */
    }
}
