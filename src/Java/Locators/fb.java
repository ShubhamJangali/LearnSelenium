package Java.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.dom.model.ShapeOutsideInfo;

public class fb {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chromedriver.driver", "F:\\ATH\\Software\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        int count = driver.findElements(By.tagName("b")).size();
       // driver.findElement(By.tagName(""))
        driver.findElement(By.name("lastname")).sendKeys("Patil");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email__")).sendKeys("7666280458");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Pass@123");
        driver.findElement(By.name("birthday_day")).sendKeys("18");
        driver.findElement(By.name("birthday_month")).sendKeys("DEC");
        driver.findElement(By.name("birthday_year")).sendKeys("2000");
        driver.findElement(By.name("sex")).click();
        driver.findElement(By.name("websubmit")).click();
    }
}
