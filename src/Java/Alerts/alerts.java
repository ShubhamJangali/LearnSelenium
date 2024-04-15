package Java.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chromedriver.driver","F:\\ATH\\Software\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:100");
        driver.manage().window().maximize();
        driver.findElement(By.name("user_name")).sendKeys("admin");
        driver.findElement(By.name("user_password")).sendKeys("admin");
        WebElement ele = driver.findElement(By.name("login_theme"));
        Select select = new Select(ele);
        // select.selectByIndex(2);
        //select.selectByValue("orange");
        select.selectByVisibleText("Aqua");
        Thread.sleep(2000);
        driver.findElement(By.name("Login")).click();

        driver.findElement(By.linkText("New Lead")).click();
        driver.findElement(By.name("button")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.findElement(By.name("lastname")).sendKeys("Jangali");

        driver.findElement(By.name("button")).click();
        alert.accept();

        driver.findElement(By.name("company")).sendKeys("Shubham jangali");
        driver.findElement(By.name("button")).click();
    }
}
