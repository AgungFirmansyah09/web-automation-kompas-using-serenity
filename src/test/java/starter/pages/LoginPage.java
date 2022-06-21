package starter.pages;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginPage  extends PageObject {

    private By emailField (){
        return By.id("email");
    }

    private By passwordField (){
        return By.id("password");
    }

    private By loginButton (){
        return By.xpath("//input[@value='Login']");
    }

    @Step
    public void onPage(){
        open();
    }

    @Step
    public boolean ValidationLoginPage(){
        return $(loginButton()).isDisplayed();
    }

    @Step
    public void inputEmail(String email){
        $(emailField()).type(email);
    }

    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public void clickLoginButton(){
        $(loginButton()).click();
    }
}
