package JSAlerts;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTests extends BaseTest {
    @Test
    public void UploadFileTest(){
        var _fileUploadPage = homePage.clickFileUploadLink();
        _fileUploadPage.UploadFile("C:\\Users\\haider.ali\\Desktop\\TestAutomationProject\\resources\\chromedriver.exe");
        _fileUploadPage.ClickUploadButton();
        Assert.assertEquals(_fileUploadPage.VerifyFileUpload(),"chromedriver.exe","File Is not uploaded");
    }
}
