package ForgotPassword;

import Base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;

import static org.testng.Assert.assertTrue;

public class ForgotpasswordTests extends BaseTest {

    @Test
    public void VerifyForgotPasswordFunctionality(){
        var _forgotPassword = homePage.clickForgotPasswordLink();
        _forgotPassword.clickOnEmailField();
        _forgotPassword.enterEmailInForgotPasswordField("123@email.com");
        var emailSentPage =  _forgotPassword.clickOnRetrieveEmailButton();
        assertTrue(emailSentPage.verifySuccessMessage().contains("Your e-mail's been sent!"), "Invalid");
    }
}
