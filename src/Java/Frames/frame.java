package Java.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class frame {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/frames");
        driver.manage().window().maximize();
        driver.switchTo().frame("frame1");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Shubham");
        driver.switchTo().frame("frame3");
        driver.findElement(By.xpath("//input[@id='a']")).click();
        driver.switchTo().defaultContent();
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame2");
        Select sel = new Select(driver.findElement(By.id("animals")));
        sel.selectByVisibleText("Baby Cat");
    }
}
