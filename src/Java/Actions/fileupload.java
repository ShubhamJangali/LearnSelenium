package Java.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {
    public static void main(String[] args) {
        System.setProperty("webdriver.chromedriver.driver","F:\\ATH\\Software\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:100");
        driver.manage().window().maximize();
        driver.findElement(By.name("user_name")).sendKeys("admin");
        driver.findElement(By.name("user_password")).sendKeys("admin");
        driver.findElement(By.name("Login")).click();
        driver.findElement(By.partialLinkText("New Product")).click();
        driver.findElement(By.xpath("//input[@name=\"imagename\"]")).sendKeys("C:/Users/HP/OneDrive/Desktop/git.txt");
    }
}
