package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GeneralHomePage {
    WebDriver driver;

    public GeneralHomePage(WebDriver driver) {
        this.driver = driver;
    }

    private final By mgrPageMessage = By.xpath("//marquee[@class='heading3']");

    public String checkLoginMessage(){
        return driver.findElement(mgrPageMessage).getText();
    }
}
