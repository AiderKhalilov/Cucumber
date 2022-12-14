package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import utils.CommonMethods;

public class LoginPage extends CommonMethods {
    @FindBy(id="txtUsername")
    public WebElement usernameTextField;

    @FindBy(id="txtPassword")
    public WebElement passwordTextField;

    @FindBy(id="btnLogin")
    public WebElement loginButton;

    @FindBy(id="spanMessage")
    public WebElement invalidMessage;

    @FindBy(xpath="//*[@id='spanMessage']")
    public WebElement errorMessage;


    public LoginPage(){
        //call selenium page factory
        PageFactory.initElements(driver, this);
    }

}
