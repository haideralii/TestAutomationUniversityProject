package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    public FileUploadPage(WebDriver driver){ this.driver = driver; }

    private By _fileUpload = By.id("file-upload");
    private By _fileSubmit = By.id("file-submit");
    private By _verifyFileUpload = By.id("uploaded-files");

    public void UploadFile(String filename){
        driver.findElement(_fileUpload).sendKeys(filename);
    }

    public void ClickUploadButton(){
        driver.findElement(_fileSubmit).click();
    }

    public String VerifyFileUpload(){
       return driver.findElement(_verifyFileUpload).getText();
    }

}
