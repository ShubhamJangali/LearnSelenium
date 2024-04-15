package Java.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iamfeelinglucky {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chromedriver.driver","F:\\ATH\\Software\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        //input[contains(@data-ved,'CBA')]
        driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]")).sendKeys("Selenium");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[contains(@data-ved,\"CAs\")]")).click();
//        driver.findElement(By.xpath("//input[contains(@data-ved,'CBA')]")).click();
    }
}
