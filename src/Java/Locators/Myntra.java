package Java.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chromedriver.driver","\"F:\\\\ATH\\\\Software\\\\chromedriver.exe\"");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.myntra.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[@class=\"desktop-userTitle\"]")).click();
        driver.findElement(By.xpath("//a[@class=\"desktop-linkButton\"]")).click();
        driver.findElement(By.xpath("//input[@autocomplete=\"new-password\"]")).sendKeys("8080956494");
        Thread.sleep(10000);
        driver.findElement(By.xpath("//div[@class=\"submitBottomOption\"]")).click();
    }
}
