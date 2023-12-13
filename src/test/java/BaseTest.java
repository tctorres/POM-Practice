import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest{
    WebDriver driver = null;

    @BeforeTest
    public void beforeTest(){
        String driverPath = "C:\\Users\\tania.torres\\IdeaProjects\\pom-practice\\src\\utils\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
    }

    @AfterTest
    public void afterTest() {
        driver.close();
    }


}