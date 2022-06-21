package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    private By textH2(){
        return By.xpath("//h1[text()='Agung Firmansyah']");
    }

    @Step
    public void ValidationHomePage(){
        $(textH2()).waitUntilVisible().isDisplayed();
    }

    private By ErrorMessage (){
        return By.className("form-error");
    }
    @Step
    public void ValidationError(){
        $(ErrorMessage()).isDisplayed();
    }
}
