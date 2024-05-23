package Java.Locators;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.io.File;
import java.time.Duration;
import java.util.List;

public class Practice_Here {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chromedriver.driver","F:\\ATH\\Software\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("http://localhost:100/index.php?action=Login&module=Users");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//select[@name=\"login_theme\"]")).sendKeys("orange");
        driver.findElement(By.xpath("//input[@title=\"Login [Alt+L]\"]")).click();
        driver.findElement(By.xpath("//a[text()='Leads']")).click();
        List<WebElement> elements = driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println(elements.size());
    }
}
