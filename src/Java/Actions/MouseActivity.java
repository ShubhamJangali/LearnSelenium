package Java.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseActivity {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chromedriver.driver","F:\\ATH\\Software\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:100");
        driver.manage().window().maximize();
        driver.findElement(By.name("user_name")).sendKeys("admin");
        driver.findElement(By.name("user_password")).sendKeys("admin");
        driver.findElement(By.name("Login")).click();
        Actions act = new Actions(driver);
        Action newact = act.moveToElement(driver.findElement(By.xpath("//a[@id=\"showSubMenu\"]"))).build();
        newact.perform();
        act.click(driver.findElement(By.xpath("//a[text()=\"New Vendor\"]"))).perform();
        act.moveToElement(driver.findElement(By.linkText("My Account"))).click().perform();
        act.moveToElement(driver.findElement(By.name("Customise"))).click().perform();
        act.scrollToElement(driver.findElement(By.linkText("Copyrights"))).perform();
        Thread.sleep(2000);
        act.scrollToElement(driver.findElement(By.linkText("My Account"))).click().perform();
    }
}
