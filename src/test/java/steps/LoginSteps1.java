package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods1;
import utils.ConfigReader;

public class LoginSteps1 extends CommonMethods1 {
    // do not need cause extended from CommonMethods WebDriver driver;
    /*@Given("user is navigated to HRMS application")
    public void user_is_navigated_to_hrms_application() {
        openBrowserAndLaunchApplication ();
    }

    @When("user enters valid username and valid password")
    public void user_enters_valid_username_and_valid_password() {
        WebElement usernameField = driver.findElement ( By.id ( "txtUsername" ) );
        usernameField.sendKeys ( ConfigReader.getPropertyValue ( "username" ) );

        WebElement passwordField = driver.findElement ( By.id ( "txtPassword" ) );
        passwordField.sendKeys ( ConfigReader.getPropertyValue ( "password" ) );
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        WebElement clickBtn = driver.findElement ( By.id ( "btnLogin" ) );
        clickBtn.click ();
    }

    @Then("user is successfully logged in")
    public void user_is_successfully_logged_in() {
        WebElement welcomeMessage = driver.findElement ( By.id ( "welcome" ) );
        if (welcomeMessage.isDisplayed ()) {
            System.out.println ( "Test success" );
        } else {
            System.out.println ( "Failed" );
        }
    }*/
}
