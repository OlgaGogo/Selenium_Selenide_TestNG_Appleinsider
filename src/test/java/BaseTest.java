import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

abstract public class BaseTest {

    public void SetUp(){
        WebDriver driver = new ChromeDriver();
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
