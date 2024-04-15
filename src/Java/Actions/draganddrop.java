package Java.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
    public static void main(String[] args) {
        System.setProperty("webdriver.chromedriver.driver","F:\\ATH\\Software\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:100");
        driver.manage().window().maximize();
        driver.findElement(By.name("user_name")).sendKeys("admin");
        driver.findElement(By.name("user_password")).sendKeys("admin");
        driver.findElement(By.name("Login")).click();
        driver.findElement(By.partialLinkText("My Account")).click();
        driver.findElement(By.xpath("//input[@name=\"Customise\"]")).click();
        Actions act = new Actions(driver);
        act.dragAndDrop(driver.findElement(By.xpath("//td[@id=\"cl1\"]")),driver.findElement(By.xpath("//td[@id=\"cl6\"]"))).perform();
        driver.findElement(By.xpath("//td[@id=\"cl4\"]")).getText().equals("Contacts");
    }
}
