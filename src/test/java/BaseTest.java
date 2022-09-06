import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

abstract public class BaseTest {

    public void SetUp(){
        WebDriverManager.chromedriver().setup();
        Configuration.headless = false;
    }

    @BeforeTest
    public void init() {
        SetUp();
    }

    @AfterTest
    public void TearDown(){
        Selenide.closeWebDriver();
    }
}
