package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.LoginPage;

public class LoginSteps {

    @Steps
    LoginPage loginPage;
    HomePage homePage;

    @Given("I Open Kompas Login Page")
    public void OpenKompasLoginPage() {
        loginPage.onPage();
        loginPage.ValidationLoginPage();
    }

    @When("I Input valid email")
    public void InputValidEmail() {
        loginPage.inputEmail("firmansya15agung09@gmail.com");
    }

    @And("I Input valid password")
    public void InputValidPassword() {
        loginPage.inputPassword("Agung090596");
    }

    @And("I Click button login")
    public void ClickButtonLogin() {
        loginPage.clickLoginButton();
    }

    @Then("I can see my home page")
    public void CanSeeMyHomePage(){
        homePage.ValidationHomePage();
    }

    @When("I input wrong email")
    public void InputWrongEmail() {
        loginPage.inputEmail("firmansyah15agung009@gmail.com");
    }

    @And("I input wrong password")
    public void InputWrongPassword() {
        loginPage.inputPassword("Agung0900090");
    }

    @Then("I can see error message")
    public void CanSeeErrorMessage() {
        homePage.ValidationError();
    }
}
