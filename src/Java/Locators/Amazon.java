package Java.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chromedriver.driver","F:\\ATH\\Software\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[text()=\"Account & Lists\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"ap_email\"]")).sendKeys("8080956494");
        driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"ap_password\"]")).sendKeys("8080956494");
        driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("CricketBat");
        driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
        driver.findElement(By.xpath("//span[text()=\"Ske Popular Willow Cricket Bat With Bat Cover For Men'S And Adult All Tennis Ball (Natural, Full Size), Wood, Multicolour\"]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]")).click();
    }
}
