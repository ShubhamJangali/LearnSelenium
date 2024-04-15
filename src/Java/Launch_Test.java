package Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chromedriver.driver","\"F:\\ATH\\Software\\chromedriver.exe\"");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
    }
}
