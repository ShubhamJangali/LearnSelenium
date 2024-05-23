package Java.JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
    public static void main(String[] args) {
        System.setProperty("webdriver.chromedriver.driver","F:\\ATH\\Software\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:100");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement id = driver.findElement(By.name("user_name"));
        WebElement pass = driver.findElement(By.name("user_password"));
        WebElement login = driver.findElement(By.name("Login"));
        js.executeScript("arguments[0].value='admin';",id);
        js.executeScript("arguments[0].value='admin';",pass);
        js.executeScript("arguments[0].click();",login);
    }
}
