package Hovers;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HoversPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoversTests extends BaseTest {

    @Test
    public void HoverOverFigureTest() {
        HoversPage hoversPage = homePage.clickHoverLink();
        HoversPage.FigureCaptions figureCaption = hoversPage.HoverImage(1);
        assertTrue(figureCaption.isCaptionDisplayed(), "Invalid link");
        assertEquals(figureCaption.getHeaderText(), "name: user1", "header does not match");
        assertEquals(figureCaption.getLinkText(), "View profile", "link does not match");
    }

}
