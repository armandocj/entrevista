package UI;

import framework.pages.LoginPage;
import framework.util.JsonDataHandler;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class MailTests {

    private WebDriver driver;
    private JsonDataHandler dataHandler;

    @BeforeTest(alwaysRun = true)
    public void setup(){
        System.setProperty("webdriver.chrome.driver","./resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void Login_Sucess() throws Exception {


        dataHandler = new JsonDataHandler("TC1");
        String url = dataHandler.getValue("url");
        driver.get(url);
        driver.manage().window().maximize();
        LoginPage loginPag = new LoginPage(driver);
        loginPag.logUser(
                dataHandler.getValue("user"),
                dataHandler.getValue("password")
        );

        driver.quit();
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
