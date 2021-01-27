import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRegistro {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        By locator = By.className("login");
        WebElement element = driver.findElement(locator);
        element.click();
        
        driver.findElement(By.id("email_create")).sendKeys("testing.handelbay@gmail.com");


    }
}
