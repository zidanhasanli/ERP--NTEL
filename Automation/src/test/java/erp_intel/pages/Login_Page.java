package erp_intel.pages;

import erp_intel.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

    public Login_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="basic_username")
    public WebElement userName;

    @FindBy(id="basic_password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submit;

}