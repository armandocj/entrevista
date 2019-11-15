package framework.pages;


import framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends BasePage {

    private By UserName = By.cssSelector("[name='identifier']");
    private By SiguienteBtn = By.xpath("//*[text()='Siguiente']");
    private By PasswordBox = By.cssSelector("[name='password']");
    private By InboxLabel = By.xpath("//*[text()='Siguiente']");

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    private void insertUser(String user){
        sendValue(UserName, user);
    }

    private void insertPwd (String password){
        sendValue(PasswordBox, password);
    }

    public void clickOnSiguiente(){
        clickOn(SiguienteBtn);
    }

    public void logUser(String user, String password){
        insertUser(user);
        clickOnSiguiente();
        insertPwd(password);
        clickOnSiguiente();
    }



}
