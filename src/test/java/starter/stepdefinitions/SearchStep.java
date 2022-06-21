package starter.stepdefinitions;

import io.cucumber.java.en.*;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.LoginPage;
import starter.pages.SearchPage;

public class SearchStep {
    @Steps
    LoginPage loginPage;
    HomePage homePage;
    SearchPage searchPage;

    @Given("I has login in kompas")
    public void iHasLoginInKompas() {
        loginPage.onPage();
        loginPage.ValidationLoginPage();
        loginPage.inputEmail("firmansya15agung09@gmail.com");
        loginPage.inputPassword("Agung090596");
        loginPage.clickLoginButton();
        homePage.ValidationHomePage();
    }

    @When("I in home page kompas")
    public void iInHomePageKompas() {
        searchPage.clickButtonNext();
    }

    @And("I input news")
    public void iInputNews() {
        searchPage.Searchinput("viral");
    }

    @And("I clik button Search")
    public void iClikButtonSearch() {
        searchPage.clickbuttonSearch();

    }

    @And("I click news in the second line")
    public void iClickNewsInTheSecondLine() {
        searchPage.ClickButtonNews();
    }

    @Then("I can see the news")
    public void iCanSeeTheNews() {
        searchPage.ViewNews();
    }

}
