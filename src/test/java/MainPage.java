import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Main page of the website Appleinsider
 */
public class MainPage {
    private final SelenideElement textBoxInput = $x("//input[@type='text']");

    public MainPage(String url){
        Selenide.open(url);
    }

    /**
     * Do search and press Enter
     * @param searchString search box
     */
    public ResultPage search(String searchString){
        textBoxInput.setValue(searchString);
        textBoxInput.sendKeys(Keys.ENTER);
        return new ResultPage();
    }

}
