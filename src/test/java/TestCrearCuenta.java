import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCrearCuenta {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        By locator = By.className("login");
        WebElement element = driver.findElement(locator);
        element.click();

        driver.findElement(By.id("email_create")).sendKeys("testing.handelbay@gmail.com");
        driver.findElement(By.id("SubmitCreate")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String pageHeading = driver.findElement(By.className("page-heading")).getText();
        System.out.println("Page Heading: "+pageHeading);


    }
}
