package Frames;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WYSIWYGEditorPage;

public class FramesTests extends BaseTest {

    @Test
    public void EnterTextInEditorTest(){
        WYSIWYGEditorPage _wysiwygeditorPage = homePage.clickWYSIWYGEditorLink();

        String text1 = "Hello ";
        String text2 = "World";

        _wysiwygeditorPage.ClearTextFromEditor();
        _wysiwygeditorPage.EnterTextInEditor(text1);
        _wysiwygeditorPage.ClickOnDecreaseIndentation();
        _wysiwygeditorPage.EnterTextInEditor(text2);
        Assert.assertEquals(_wysiwygeditorPage.GetTextFromEditor(),text1+text2,"The text is not same as inserted");

    }

}
