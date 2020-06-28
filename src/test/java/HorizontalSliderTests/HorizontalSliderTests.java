package HorizontalSliderTests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HorizontalSliderTests extends BaseTest {
    @Test
    public void SliderTestThroughKeys(){
        String value = "4";
        var _horizontalSlider= homePage.clickHorizontalSliderLink();
        _horizontalSlider.clickOnHorizontalSlider();
        _horizontalSlider.PassKeyToSlider(value);
        Assert.assertEquals(_horizontalSlider.getRangeText(), "4", "you have already cross 4");
    }
}
