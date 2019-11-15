package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    private WebDriver driver;

    public BasePage(WebDriver webDriver){
        this.driver = webDriver;
    }

    public void clickOn(By locator){
        try{
            WebElement element = driver.findElement(locator);
            element.click();
        }catch(Exception e){}
    }

    public void sendValue(By locator, String value){
        try{
            WebElement element = driver.findElement(locator);
            element.sendKeys(value);
        }catch (Exception e){}
    }



}
