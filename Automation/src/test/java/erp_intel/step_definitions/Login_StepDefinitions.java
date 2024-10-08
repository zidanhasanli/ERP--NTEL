package erp_intel.step_definitions;

import erp_intel.pages.Login_Page;
import erp_intel.utilities.*;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class Login_StepDefinitions {

    Login_Page loginPage = new Login_Page();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("erp-intel.url"));
    }

    @When("User enters correct {string} and {string}")
    public void user_enters_correct_and(String username, String password) {

        loginPage.userName.sendKeys(username);
        loginPage.password.sendKeys(password);
    }

    @When("User click to the login button")
    public void user_click_to_the_login_button() {

        loginPage.submit.click();
    }

    @Then("User is successfully logged in and url change to {string}")
    public void user_is_successfully_logged_in_and_url_change_to(String expectedURL) {

        Driver.sleep(2);
        Assert.assertEquals(expectedURL,Driver.getDriver().getCurrentUrl());
    }

    @When("User enters incorrect {string} and {string}")
    public void userEntersIncorrectAnd(String invalidUsername, String invalidPassword) {

        loginPage.userName.sendKeys(invalidUsername);
        loginPage.password.sendKeys(invalidPassword);

    }

    @Then("User is not able to logged in and url is {string}")
    public void userIsNotAbleToLoggedInAndUrlIs(String expectedURL) {
        Driver.sleep(2);

        Assert.assertEquals(expectedURL,Driver.getDriver().getCurrentUrl());
    }
}
