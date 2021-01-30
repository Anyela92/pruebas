import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;

public class TestBuscar {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        By locatoR = new ByIdOrName("search_query_top");
        WebElement searchBox= driver.findElement(locatoR);
        searchBox.sendKeys("Dress");

    }
}
