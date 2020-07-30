package Base;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.ITest;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.EventListener;
import utils.WindowHandler;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class BaseTest {
   private WebDriver driver;
   protected HomePage homePage;

   @BeforeClass
   public void setUp(){
       System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
       driver = new ChromeDriver(getChromeOptions());
       // driver.register(new EventListener());
       homePage = new HomePage(driver);
       Home();

       driver.manage().window().maximize();
       System.out.println(driver.getTitle());

   }

   @BeforeMethod
   public void Home(){
       driver.get("https://the-internet.herokuapp.com/");
   }

   @AfterClass
   public void tearDown(){
       driver.quit();
   }

   @AfterMethod
   public void recordFailure(ITestResult result){

       if (ITestResult.FAILURE == result.getStatus()){
           TakesScreenshot _camera = (TakesScreenshot)driver;
           File _screenShot = _camera.getScreenshotAs(OutputType.FILE);

           try {
               Files.move(_screenShot, new File("resources/ScreenShots/" + result.getName() + ".png"));
           }catch (IOException e){
               e.printStackTrace();
           }
       }
   }

   public WindowHandler getWindowHandler(){
       return new WindowHandler(driver);
   }

   private ChromeOptions getChromeOptions(){
       ChromeOptions options = new ChromeOptions();
       options.getVersion();
   //    options.setHeadless(true);
       return options;
   }
}
