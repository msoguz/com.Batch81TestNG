package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HMCPage {

    public HMCPage (){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy (xpath = "//*[text()='Log in']")
    public WebElement login;

}
