package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class HoversPage {
    private WebDriver driver;

    public HoversPage(WebDriver driver) {
        this.driver = driver;
    }

    private By _figureBox = By.className("figure");

    public FigureCaptions HoverImage(int index){
        WebElement _figure = driver.findElements(_figureBox).get(index-1);

        Actions actions = new Actions(driver);
        actions.moveToElement(_figure).perform();

        return new FigureCaptions(driver.findElement(_figureBox));

    }

    public class FigureCaptions{
        private WebElement caption;
        private By header = By.tagName("h5");
        private By link = By.tagName("a");

        public FigureCaptions(WebElement caption){ this.caption = caption; }

        public boolean isCaptionDisplayed(){
            return caption.isDisplayed();
        }

        public String getHeaderText(){
            return caption.findElement(header).getText();
        }

        public String getLink(){
            return caption.findElement(link).getAttribute("a");
        }

        public String getLinkText(){
            return caption.findElement(link).getText();
        }


    }


}


