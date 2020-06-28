package KeyPresses;

import Base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.KeyPressPage;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class KeyPresstests extends BaseTest {

    @Test
    public void PressBackSpaceTests(){
        var _keyPress = homePage.clickKeyPressLink();
        _keyPress.EnterText("A" + Keys.BACK_SPACE);
        assertEquals("You entered: BACK_SPACE", _keyPress.getResult());
    }

    @Test
    public void EnterPiTest(){
        var _keyPress = homePage.clickKeyPressLink();
        _keyPress.EnterPi();
        assertEquals("You entered: 4", _keyPress.getResult());
    }
}
