package Java.JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class executor {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chromedriver.driver","F:\\ATH\\Software\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:100");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@title=\"Login [Alt+L]\"]")).click();
        driver.findElement(By.xpath("//a[text()='New Product']")).click();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)","");
        WebElement ele = driver.findElement(By.name("product_description"));
        js.executeScript("arguments[0].value='shubham';",ele);
    }
}
