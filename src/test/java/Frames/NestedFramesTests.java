package Frames;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FramesPage;
import pages.NestedFramesPage;

public class NestedFramesTests extends BaseTest {

    @Test
    public void VerifyTextFromLeftFrame(){
        FramesPage _framesLink = homePage.clickOnFramesLink();
        NestedFramesPage _nestedFrameLink = _framesLink.ClickOnNestedFramesLink();

       Assert.assertEquals(_nestedFrameLink.GetTextFromLeftFrame(), "LEFT", "Text is not equal to Left Frame");
       Assert.assertEquals(_nestedFrameLink.GetTextFromBottomFrame(), "BOTTOM", "Text is not equal to Bottom Frame");


    }
}
