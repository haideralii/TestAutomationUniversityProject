package Login;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecurePage;
import org.testng.Assert.*;

import static org.testng.Assert.*;

public class LoginTests extends BaseTest {

    @Test
    public void TestSuccessFullLoginTest(){
        LoginPage loginPage = homePage.ClickBasicAuthLink();
        loginPage.EnterUserName("tomsmith");
        loginPage.EnterPassword("SuperSecretPassword!");
        SecurePage securePage = loginPage.ClickLoginButton();
        assertTrue(securePage.SuccessMessage().contains("You logged into a secure area!"), "InValid Login");
    }

}
