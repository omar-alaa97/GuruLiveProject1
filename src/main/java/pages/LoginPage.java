package pages;


import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Base {
    private final WebDriver driver;
    private final By emailField = By.name("uid");
    private final By passwordField = By.name("password");
    private final By loginButton = By.name("btnLogin");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public GeneralHomePage login(String userID,String password) {
        driver.findElement(emailField).sendKeys(userID);
        driver.findElement(passwordField).sendKeys(password);

        driver.findElement(loginButton).click();
        return new GeneralHomePage(driver);
    }


}
