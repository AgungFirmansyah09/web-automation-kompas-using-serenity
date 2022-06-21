package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class SearchPage extends PageObject {
    // Button Next
    private By buttonNext (){
        return By.xpath("//img[@src='https://asset.kompas.com/data/2020/widget/ssonew/asset/images/icon-back.png']");
    }
    @Step
    public void clickButtonNext (){
        $(buttonNext()).waitUntilVisible().click();
    }

    //Field Search
    private By SearchField (){
        return By.xpath("//input[@id='search']");
    }
    @Step
    public void Searchinput (String Search){
        $(SearchField()).type(Search);
    }

    //Button Search
    private By buttonSearch (){
        return By.xpath("//input[@name='submit']");
    }
    @Step
    public void clickbuttonSearch (){
        $(buttonSearch()).click();
    }

    //Click Menu ke 2 dari pencarian
    private By idNews (){
        return By.xpath("//img[@src='https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRLNZpk14p5RnMa2-2L2o3R20iQU5rzZv81YHmqZ44irJRu6fCxNFBi3CV3']");
    }
    @Step
    public void ClickButtonNews (){
        $(idNews()).click();
    }

    //User view News viral
    private By TitleH1 (){
        return By.xpath("//h1[text()='Viral, Unggahan Pelanggan PLN Didenda hingga Rp 68 Juta karena Segel Meteran Tidak Asli, Ini Penjelasannya']");
    }
    @Step
    public void ViewNews (){
        $(TitleH1()).isDisplayed();
    }


}
