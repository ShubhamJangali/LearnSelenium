package Java.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chromedriver.driver","F:\\ATH\\Software\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Shubham");
        driver.findElement(By.name("lastname")).sendKeys(("Jangali"));
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email__")).sendKeys("shubhamjangali252001@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("shubhamjangali252001@gmail.com");

        driver.findElement(By.name("reg_passwd__")).sendKeys("Shubhamjangali@123");
        driver.findElement(By.name("birthday_day")).sendKeys("25");
        driver.findElement(By.name("birthday_month")).sendKeys("Aug");
        driver.findElement(By.name("birthday_year")).sendKeys("2001");
        driver.findElement(By.name("sex")).click();
        driver.findElement(By.name("websubmit")).click();
    }
}
