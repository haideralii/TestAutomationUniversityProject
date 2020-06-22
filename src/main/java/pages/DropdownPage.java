package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {

    private WebDriver driver;

    public DropdownPage(WebDriver driver){
        this.driver = driver;
    }

    private By dropdown = By.id("dropdown");

    private Select findDropdownElements(){
        return new Select(driver.findElement(dropdown));
    }

    public List<String> getAllSelectedOptions(){
        List<WebElement> selectedOptions = findDropdownElements().getAllSelectedOptions();
        return selectedOptions.stream().map(e->e.getText()).collect(Collectors.toList());
    }

    public void selectFromDropDown(String options){
        findDropdownElements().selectByVisibleText(options);
    }

}
