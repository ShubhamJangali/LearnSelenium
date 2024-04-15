package Java.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

    public static void main(String[] args) {
        System.out.println("welcome to automation test hub");
        System.setProperty("webdriver.chrome.driver","F:\\ATH\\Software\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
        driver.findElement(By.name("email")).sendKeys("Admin@gmail.com");
        driver.findElement(By.name("pass")).sendKeys(("12345"));
        driver.findElement(By.name("Java.Locators.login")).click();

    }
}
