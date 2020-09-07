package ForgotPassword;

import Base.BaseTest;
import org.testng.annotations.Test;
import pages.ForgotPasswordEmailSentPage;
import pages.ForgotPasswordPage;

import static org.testng.Assert.assertTrue;

public class ForgotpasswordTests extends BaseTest {

   @Test
    public void VerifyForgotPasswordFunctionality(){

       ForgotPasswordPage _forgotPassword = homePage.clickForgotPasswordLink();
        _forgotPassword.clickOnEmailField();
        _forgotPassword.enterEmailInForgotPasswordField("123@email.com");
       ForgotPasswordEmailSentPage emailSentPage =  _forgotPassword.clickOnRetrieveEmailButton();
        assertTrue(emailSentPage.verifySuccessMessage().contains("Your e-mail's been sent!"), "Invalid result");
    }

}
