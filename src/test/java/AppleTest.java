import org.testng.Assert;
import org.testng.annotations.Test;

public class AppleTest extends BaseTest{

    private final static String BASE_URL = "https://appleinsider.ru";
    private final static String SEARCH_STRING = "Чем iPhone 13 отличается от iPhone 12";
    private final static String HREF_ATR = "iphone-13";

    @Test
    public void checkHREF(){
        Assert.assertTrue(new MainPage(BASE_URL)
                .search(SEARCH_STRING)
                .getHrefFromFirstArticle()
                .contains(HREF_ATR));
    }

}
