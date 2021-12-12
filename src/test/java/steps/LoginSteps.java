package steps;


import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GeneralHomePage;
import pages.LoginPage;

public class LoginSteps extends Base {

    LoginPage loginPage;
    GeneralHomePage generalHomePage;

    @Given("User open the website and go to login page")
    public void login_To_Homepage() {
        initialization();
       driver.get(props.getProperty("url"));


    }

    @When("user enter {string} & {string} and click login button")
    public void enterValidCredentials(String userId,String password) {
        loginPage = new LoginPage(driver);
        generalHomePage = loginPage.login(userId, password);
    }

    @Then("user should login successfully")
    public void user_should_navigate_to_homePage() {
       Assert.assertTrue(generalHomePage.checkLoginMessage().contains("Welcome To Manager's Page of Guru99 Bank"));

    }
    
    @Then("user should get an error message")
    public void error_message_should_appear(){
   String alertErrorMessage= driver.switchTo().alert().getText();
    Assert.assertTrue(alertErrorMessage.contains("User or Password is not valid"));
        System.out.println("Alert : "+ alertErrorMessage);
        driver.switchTo().alert().accept();
    }



}
