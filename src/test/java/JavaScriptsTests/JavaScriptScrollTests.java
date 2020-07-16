package JavaScriptsTests;

import Base.BaseTest;
import org.testng.annotations.Test;

public class JavaScriptScrollTests extends BaseTest {

    @Test
    public void ScrollIntoTable(){
        homePage.clickOnLargeDeepDOMink().FindLargeTable();
    }

}
